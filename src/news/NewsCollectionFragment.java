package news;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.aprilvn.idoldongnhi.R;

import data.Lipsum;

public class NewsCollectionFragment extends ListFragment{

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		int layout = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB ?
                android.R.layout.simple_list_item_activated_1 : android.R.layout.simple_list_item_1;
		setListAdapter(new ArrayAdapter<String>(getActivity(), layout, Lipsum.Headlines));
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	    
		View view = super.onCreateView(inflater, container, savedInstanceState);
	    view.setBackgroundColor(Color.WHITE);
	    
	    return view;
	}
	
	@Override
	public void onStart(){
		super.onStart();
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		DetailFragment newFragment = new DetailFragment();
		Bundle args = new Bundle();
		args.putInt(DetailFragment.ARG_POSITION, position);
		newFragment.setArguments(args);
		FragmentTransaction transaction = getFragmentManager().beginTransaction();
		transaction.replace(R.id.content_fragment, newFragment);
		transaction.addToBackStack(null);
		transaction.commit();
	}
	
	
}
