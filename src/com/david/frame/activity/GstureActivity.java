package com.david.frame.activity;

import com.david.frame.AppBaseActivity;
import com.david.frame.R;
import com.david.frame.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class GstureActivity extends Activity {
	Button btnOpen;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_gesture);
		
		btnOpen = (Button) findViewById(R.id.btn_open);
    	btnOpen.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}

}
