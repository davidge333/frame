package com.david.frame.activity;

import com.david.frame.AppBaseActivity;
import com.david.frame.R;
import com.david.frame.zlib.net.RequestCallback;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends AppBaseActivity implements RequestCallback{
	private Button btnOne, btnTwo;
	private Context mContext;
	private LinearLayout linear_detail;
	private int newId = 13;
	
	@Override
    protected void initVariables() {
    	// TODO Auto-generated method stub
		 mContext = this;
    }
	
	@Override
    protected void initView(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	setContentView(R.layout.activity_main);
    	
    	btnOne = (Button) findViewById(R.id.btn_one);
    	btnOne.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				gotoOneActivity();
			}
		});
    	
    	btnTwo = (Button) findViewById(R.id.btn_two);
    	btnTwo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				gotoTwoActivity();
			}
		});
    	
    	linear_detail = (LinearLayout) findViewById(R.id.linear_detail);
    	linear_detail.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				gotoDetailActivity();
			}
		});
    }
    
    
    private void gotoOneActivity() {
    	startActivity(new Intent(mContext, DetailActivity.class));
    }
    
    private void gotoTwoActivity() {
    	startActivity(new Intent(mContext, TwoActivity.class));
    }
    
    private void gotoDetailActivity() {
    	Intent detailIntent = new Intent(mContext, DetailActivity.class);
    	detailIntent.putExtra("new_id", newId);
    	startActivity(detailIntent);
    }

	@Override
	protected void loadData() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onSuccess(String content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFail(String errorMessage) {
		
	}

}
