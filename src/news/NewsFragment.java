package news;


import com.aprilvn.idoldongnhi.R;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NewsFragment extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	
	private FragmentTabHost mTabHost;
	// Tab titles
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreateView(inflater, container, savedInstanceState);
		View view = inflater.inflate(R.layout.news_wrapper_fragment, container, false);
		Log.v("view view", "" + view );
		
		view.setBackgroundColor(Color.parseColor("#34495e"));
		
		mTabHost = (FragmentTabHost) view.findViewById(android.R.id.tabhost);
		mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.realtabcontent);
		
		Bundle b = new Bundle();
		b.putString("key", "News");
		mTabHost.addTab(mTabHost.newTabSpec("News").setIndicator("News"),
				NewsCollectionFragment.class, b);

		b = new Bundle();
		b.putString("key", "DongNhi");
		mTabHost.addTab(mTabHost.newTabSpec("DongNhi")
				.setIndicator("Đông Nhi"), NewsDongNhiCollectionFragment.class, b);
		return view;
	}
	
}
