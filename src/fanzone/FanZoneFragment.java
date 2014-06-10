package fanzone;

import com.aprilvn.idoldongnhi.R;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FanZoneFragment extends Fragment{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	
	
	private static TextView textview;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fanzone_fragment, container, false);
		view.setBackgroundColor(Color.parseColor("#1abc9c"));
		textview = (TextView) view.findViewById(R.id.textView1);
		textview.setTextColor(Color.WHITE);
		textview.setText("Fanzone");
		return view;
	}
}
