package com.zcl;


import com.example.logcollec.R;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Gallery;
import android.widget.ImageView;

@SuppressWarnings("deprecation")
public class MainActivity extends Activity implements OnClickListener {
	private Fragment[] mFragments;
	private FragmentManager fragmentManager;
	private FragmentTransaction fragmentTransaction;
	private Gallery gallery;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		/**
		 * 底部布局
		 * */
		ImageView mylog = (ImageView) findViewById(R.id.iv_mylog);
		ImageView myself = (ImageView) findViewById(R.id.iv_myself);
		ImageView shouye = (ImageView) findViewById(R.id.iv_shouye);
		ImageView meg = (ImageView) findViewById(R.id.iv_meg);
		mylog.setOnClickListener(this);
		myself.setOnClickListener(this);
		shouye.setOnClickListener(this);
		meg.setOnClickListener(this);
		/**
		 * 画廊
		 * */
		gallery = (Gallery) findViewById(R.id.gallery1);
		gallery.setAdapter(new ImageGalleryAdapter(this));
		/**
		 * 碎片
		 * */
		mFragments = new Fragment[4];
		fragmentManager = getFragmentManager();
		mFragments[0] = fragmentManager.findFragmentById(R.id.fragement_main);
		mFragments[1] = fragmentManager.findFragmentById(R.id.fragement_mylog);
		mFragments[2] = fragmentManager.findFragmentById(R.id.fragement_meg);
		mFragments[3] = fragmentManager.findFragmentById(R.id.fragement_myself);
		fragmentTransaction = fragmentManager.beginTransaction()
				.hide(mFragments[0]).hide(mFragments[1]).hide(mFragments[2])
				.hide(mFragments[3]);
		fragmentTransaction.show(mFragments[0]).commit();
	}

	/**
	 * 工序
	 * */

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		fragmentTransaction = fragmentManager.beginTransaction()
				.hide(mFragments[0]).hide(mFragments[1]).hide(mFragments[2])
				.hide(mFragments[3]);
		switch (v.getId()) {
		case R.id.iv_shouye:
			fragmentTransaction.show(mFragments[0]).commit();
			break;
		case R.id.iv_mylog:
			fragmentTransaction.show(mFragments[1]).commit();
			break;
		case R.id.iv_meg:
			fragmentTransaction.show(mFragments[2]).commit();
			break;
		case R.id.iv_myself:
			fragmentTransaction.show(mFragments[3]).commit();
			break;

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
