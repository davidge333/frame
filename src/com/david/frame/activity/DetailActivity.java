package com.david.frame.activity;

import java.util.ArrayList;

import com.david.frame.AppBaseActivity;
import com.david.frame.R;
import com.david.frame.zlib.net.RequestCallback;
import com.david.frame.zlib.net.RequestParameter;
import com.david.frame.zlib.net.Response;
import com.google.gson.Gson;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class DetailActivity extends AppBaseActivity implements RequestCallback{
	private Context mContext;
	private int newId;
	private TextView tv_content;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		mContext = this;
	}
	
    @Override
    protected void initView(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	setContentView(R.layout.activity_detail);
    	
    	tv_content = (TextView) findViewById(R.id.tv_content);
    }
    
	@Override
	protected void initVariables() {
		// TODO Auto-generated method stub
		newId = getIntent().getIntExtra("new_id", 0);
	}

	@Override
	protected void loadData() {
		// TODO Auto-generated method stub
		loadTargetDetail(newId);
	}
	
	private void loadTargetDetail(int id) {
		ArrayList<RequestParameter> params = new ArrayList<RequestParameter>();
		RequestParameter rp = new RequestParameter("id", newId + "");
		params.add(rp);

		//RemoteService.getInstance().invoke(this, "getDetailInfo", params,this);
	}

	@Override
	public void onSuccess(String content) {
		// TODO Auto-generated method stub
		Response oper = (new Gson()).fromJson(content, Response.class);
		if (!oper.hasError()) {
			tv_content.setText(oper.getResult());
		}
	}

	@Override
	public void onFail(String errorMessage) {
		// TODO Auto-generated method stub
		Toast.makeText(mContext, "下载失败！", Toast.LENGTH_SHORT).show();
	}

}
