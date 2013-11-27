package com.jlreds.loansimulator.filters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.text.InputFilter;
import android.text.Spanned;

public class CurrencyInputFilter implements InputFilter{
	
	Pattern p = Pattern.compile("(\\$|0|[1-9]+[0-9]*)?(\\.[0-9]{0,2})?");

	@Override
	public CharSequence filter(CharSequence source, int start, int end,
			Spanned dest, int dstart, int dend) {
		
		String result = dest.subSequence(0, dstart) + source.toString() + dest.subSequence(dend, dest.length());
		
		Matcher m = p.matcher(result);
		
		boolean mm = m.matches();
		
		CharSequence t = dest.subSequence(dstart, dend);
		
		if(mm == false){
			return 	t;
		}else{
			return null;	
		}
			
			
		
		
		
	}


}
