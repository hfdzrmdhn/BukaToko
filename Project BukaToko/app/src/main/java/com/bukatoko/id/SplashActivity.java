package com.bukatoko.id;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import android.view.View;

public class SplashActivity extends AppCompatActivity {
	
	private int loading = 3500;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setNavigationBarColor(ContextCompat.getColor(SplashActivity.this,R.color.colorPrimaryDark));
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
		setContentView(R.layout.splash_activity);
		
		
		new Handler().postDelayed(new Runnable(){
			
			
			@Override
			public void run(){
				startActivity(new Intent(getApplicationContext(),MainActivity.class));
				finish();
				
			}
		},loading);
	}
}
