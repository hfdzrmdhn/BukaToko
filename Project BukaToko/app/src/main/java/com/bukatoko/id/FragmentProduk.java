package com.bukatoko.id;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Menu;
import android.view.MenuInflater;

public class FragmentProduk extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_produk , container , false);
		setHasOptionsMenu(true);
        return v;
	}

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_produk,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }


    

}
