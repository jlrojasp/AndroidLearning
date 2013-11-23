package com.jlreds.loansimulator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LoanSimulator extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loan_simulator);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.loan_simulator, menu);
		return true;
	}

}
