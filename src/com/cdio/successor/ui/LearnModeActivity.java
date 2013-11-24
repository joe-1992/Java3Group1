package com.cdio.successor.ui;

import com.cdio.successor.ui.*;
import com.cdio.ui.successor.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class LearnModeActivity extends Activity {
	ImageView img24JieQi;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_learn_mode);
		img24JieQi=(ImageView) findViewById(R.id.img24JieQi);
		
		img24JieQi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(LearnModeActivity.this,JieQiActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.learn_mode, menu);
		return true;
	}

}
