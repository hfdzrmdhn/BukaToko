package com.bukatoko.id;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Menu;
import android.view.MenuInflater;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import androidx.vectordrawable.graphics.drawable.ArgbEvaluator;
import java.util.ArrayList;

public class FragmentHome extends Fragment {
    
    

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_home , container , false);
		
        
        setHasOptionsMenu(true);
        
        
		return v;
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		inflater.inflate(R.menu.home_notification,menu);
		super.onCreateOptionsMenu(menu, inflater);
	}
    
    
    
}
