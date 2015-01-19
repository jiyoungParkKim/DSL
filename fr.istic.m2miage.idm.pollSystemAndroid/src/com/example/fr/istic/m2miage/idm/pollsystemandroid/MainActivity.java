package com.example.fr.istic.m2miage.idm.pollsystemandroid;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		setContentView(new PollSystem1(this));
		
		
	}

}
