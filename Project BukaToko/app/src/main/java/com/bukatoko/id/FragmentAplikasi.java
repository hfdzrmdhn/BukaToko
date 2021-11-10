package com.bukatoko.id;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import android.text.Html;

public class FragmentAplikasi extends Fragment {
    
    TextView textView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_aplikasi , container , false);
        textView = (TextView) v.findViewById(R.id.editAplikasi);
        String editA = "<u> Edit Aplikasi </u>";
        getString(R.string.edit_app);
        textView.setText(Html.fromHtml(editA));
		return v;
	}



}
