package home;

import menu.MenuActivity;

import com.aprilvn.idoldongnhi.R;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class HomeFragment extends Fragment{
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
		View view = inflater.inflate(R.layout.home_fragment, container, false);
		view.setBackgroundColor(Color.parseColor("#e74c3c"));
		textview = (TextView) view.findViewById(R.id.textView1);
		textview.setTextColor(Color.BLACK);
		textview.setText("Home page");
		
		final Button button = (Button) view.findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getActivity(), MenuActivity.class);
				startActivity(i);
			}
		});

		return view;
	}
}
