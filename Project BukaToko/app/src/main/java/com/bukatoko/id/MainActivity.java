package com.bukatoko.id;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.ActionBar;
import androidx.core.content.ContextCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
    private Toolbar toolbar;
	private ActionBar toolbarTitle;
	private BottomNavigationView bottomNav;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		
		
        toolbar = (Toolbar) findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
		toolbarTitle = getSupportActionBar();
        
		bottomNav = findViewById(R.id.bottom_navigation);
		getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new FragmentHome()).commit();
		bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
			
			@Override
			public boolean onNavigationItemSelected(MenuItem item){
				Fragment selectedFragment = null;
				switch(item.getItemId()){
					
					case R.id.home:
						selectedFragment = new FragmentHome();
						toolbarTitle.setTitle("BukaToko");
						break;
					case R.id.produk:
						selectedFragment = new FragmentProduk();
						toolbarTitle.setTitle("Produk");
						break;
					case R.id.chat:
						selectedFragment = new FragmentChat();
						toolbarTitle.setTitle("Chat");
						break;
					case R.id.penjualan:
						selectedFragment = new FragmentPenjualan();
						toolbarTitle.setTitle("Penjualan");
						break;
					case R.id.aplikasi:
						selectedFragment = new FragmentAplikasi();
						toolbarTitle.setTitle("Aplikasi");
						break;
						
				}
				getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, selectedFragment).commit();
				return true;
			}
		});
        
    }
}
