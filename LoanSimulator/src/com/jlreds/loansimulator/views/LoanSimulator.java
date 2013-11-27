package com.jlreds.loansimulator.views;

import java.text.NumberFormat;
import com.jlreds.loansimulator.R;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class LoanSimulator extends Activity {

	private static final String TAG = "LoanSimulator";
	
	private EditText mEdtAmount;
	private EditText mEdtRate;
	private EditText mEdtMonths;
	private TextView mTxtCurrencySymbol;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loan_simulator);

		mEdtAmount = (EditText) findViewById(R.id.edtAmount);
		mEdtMonths = (EditText) findViewById(R.id.edtMonths);
		mEdtRate = (EditText) findViewById(R.id.edtRate);
		mTxtCurrencySymbol = (TextView) findViewById(R.id.txtCurrencySymbol);
		
		mTxtCurrencySymbol.setText(NumberFormat.getCurrencyInstance().getCurrency().getSymbol());
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()) {
		case R.id.mnItmCalculate:
			Log.i(TAG, "Calculando");
			break;

		default:
			break;
		}
		
		
		return super.onOptionsItemSelected(item);
	}

}
