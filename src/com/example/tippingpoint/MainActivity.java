package com.example.tippingpoint;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText etEditTotalAmount;
	private TextView tvTipAmount;
	private float totalTip;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		etEditTotalAmount = (EditText) findViewById(R.id.etTotalAmount);
		tvTipAmount = (TextView) findViewById(R.id.lblTipAmount);
		
		totalTip = 0;
		tvTipAmount.setText((String) "Tip is: $" + totalTip);
		
	}
	
	public void onCalcTip10p(View v) {
		try
		{
		    float totalAmount = Float.parseFloat(etEditTotalAmount.getText().toString());
			totalTip = (float) (totalAmount * 0.1);
			tvTipAmount.setText((String) "Tip is: $" + String.format("%.2f",totalTip));
		}
		catch (NumberFormatException e)
		{
			Toast.makeText(getApplicationContext(), "Enter an amount.",
					   Toast.LENGTH_SHORT).show();
		}
	}
	
	public void onCalcTip15p(View v) {
		try
		{
		    float totalAmount = Float.parseFloat(etEditTotalAmount.getText().toString());
			totalTip = (float) (totalAmount * 0.15);
			tvTipAmount.setText((String) "Tip is: $" + String.format("%.2f",totalTip));
		}
		catch (NumberFormatException e)
		{
			Toast.makeText(getApplicationContext(), "Enter an amount.",
					   Toast.LENGTH_SHORT).show();
		}
	}
	
	public void onCalcTip20p(View v) {
		try
		{
		    float totalAmount = Float.parseFloat(etEditTotalAmount.getText().toString());
			totalTip = (float) (totalAmount * 0.2);
			tvTipAmount.setText((String) "Tip is: $" + String.format("%.2f",totalTip));
		}
		catch (NumberFormatException e)
		{
			Toast.makeText(getApplicationContext(), "Enter an amount.",
					   Toast.LENGTH_SHORT).show();
		}
	}
}
