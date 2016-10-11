package com.david.frame;

import android.app.Activity;
import android.os.Bundle;

/**
 * 业务无关的公用逻辑
 * 
 * @author david
 * 
 */
public abstract class BaseActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		initVariables();
		initView(savedInstanceState);
		loadData();
	}

	protected abstract void initVariables();

	protected abstract void initView(Bundle savedInstanceState);

	protected abstract void loadData();

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}
