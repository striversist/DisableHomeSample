package com.example.disablehome;

import android.app.Activity;
import android.app.StatusBarManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
		
		/*

		this.getWindow().setType(WindowManager.LayoutParams.TYPE_KEYGUARD_DIALOG);
		

		int visFlags =  View.STATUS_BAR_DISABLE_BACK | View.STATUS_BAR_DISABLE_RECENT | View.STATUS_BAR_DISABLE_SEARCH | StatusBarManager.DISABLE_CLOCK ;
		visFlags = visFlags | View.STATUS_BAR_DISABLE_HOME;
		
		StatusBarManager mStatueBarManager;
		mStatueBarManager = (StatusBarManager)getSystemService(Context.STATUS_BAR_SERVICE);
		mStatueBarManager.disable(visFlags);
		
		*/
		
//		ImageView tv = new ImageView(this);
//		tv.setBackgroundColor(Color.TRANSPARENT);
		
		RelativeLayout tv = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_main, null);
		
		 int flags = WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
                 | WindowManager.LayoutParams.FLAG_LAYOUT_INSET_DECOR
                 | WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN;
		
		final int stretch = ViewGroup.LayoutParams.MATCH_PARENT;
        final int type = WindowManager.LayoutParams.TYPE_KEYGUARD_DIALOG;
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams(
                stretch, stretch, type, flags, PixelFormat.TRANSLUCENT);
		
		WindowManager wm = (WindowManager)this.getSystemService(Context.WINDOW_SERVICE);
		wm.addView(tv, lp);
	}

}
