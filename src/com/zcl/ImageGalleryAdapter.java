package com.zcl;

import com.example.logcollec.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

@SuppressWarnings("deprecation")
public class ImageGalleryAdapter extends BaseAdapter {

	private Context context;
	// 里面所有的方法表示的是可以根据指定的显示图片的数量,进行每个图片的处理
	private int[] image = new int[] { R.drawable.a, R.drawable.b,
	R.drawable.c, R.drawable.d, R.drawable.e };

	public ImageGalleryAdapter(Context context) {
	this.context = context;
	}

	@Override
	public int getCount() { // 取得要显示内容的数量
	return image.length;
	}

	@Override
	public Object getItem(int position) { // 每个资源的位置
	return image[position];
	}

	@Override
	public long getItemId(int position) { // 取得每个项的ID
	return image[position];
	}

	// 将资源设置到一个组件之中，很明显这个组件是ImageView
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	ImageView iv = new ImageView(context);
	iv.setBackgroundColor(0xFFFFFFFF);
	iv.setImageResource(image[position]);// 给ImageView设置资源
	iv.setScaleType(ImageView.ScaleType.CENTER);// 设置对齐方式
	iv.setLayoutParams(new Gallery.LayoutParams(LayoutParams.WRAP_CONTENT,
	LayoutParams.WRAP_CONTENT));
	return iv;
	}

}
