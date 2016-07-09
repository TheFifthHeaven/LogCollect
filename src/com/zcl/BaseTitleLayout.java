package com.zcl;

import com.example.logcollec.R;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public class BaseTitleLayout extends FrameLayout {
	Intent intent;
	public BaseTitleLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	public BaseTitleLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	public BaseTitleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.basetitle, this);
		
		    
    }  

}
