package com.cdio.successor.ui;

import com.cdio.ui.successor.R;
import com.cdio.ui.successor.R.layout;
import com.cdio.ui.successor.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class JieQiActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jie_qi);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jie_qi, menu);
		return true;
	}

}
