package com.david.frame;

import com.david.frame.activity.GstureActivity;

import android.content.Intent;
import android.os.Bundle;


/**
 * 业务相关的公用逻辑
 * @author david
 *
 */
public abstract class AppBaseActivity extends BaseActivity{
	//protected ProgressDialog commonProgressDialog;
	private FrameApplication fapp;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		fapp = (FrameApplication) getApplication();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		if (java.lang.System.currentTimeMillis() - fapp.getPauseTime() > 10000) {
			startActivity(new Intent(this, GstureActivity.class));
		}
		
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		fapp.setPauseTime(java.lang.System.currentTimeMillis());
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}
