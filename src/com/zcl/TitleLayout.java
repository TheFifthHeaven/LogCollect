package com.zcl;

import com.example.logcollec.R;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TitleLayout extends FrameLayout implements OnClickListener {
	
	Intent intent;
	public TitleLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public TitleLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public TitleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.title, this);
		TextView biaoduan=(TextView) findViewById(R.id.tv_biaoduan);
		TextView dongkou=(TextView) findViewById(R.id.tv_dongkou);
		ImageView yulan=(ImageView) findViewById(R.id.iv_yulan);
		
		yulan.setOnClickListener(this); 
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
        
        case R.id.iv_yulan:        	
        	intent = new Intent(getContext(), YuLanActivity.class);
        	getContext().startActivity(intent);
            break;
        default:
            Toast.makeText(getContext(), "Î¬»¤ÖÐ¡£¡£¡£", Toast.LENGTH_SHORT).show();
        }
	}
}
