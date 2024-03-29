package news;

import com.aprilvn.idoldongnhi.R;

import data.Lipsum;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment{
	final static String ARG_POSITION = "position";
	int mCurrentPosition = -1;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
		if(savedInstanceState != null){
			mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
		}
		// Inflate the layout for this fragment
	
		View view = inflater.inflate(R.layout.news_collection_detail_fragment, container, false);
	    view.setBackgroundColor(Color.WHITE);
	    return view;
	}
	
	
	@Override
	public void onStart(){
		super.onStart();
		
		Bundle args = getArguments();
		if(args != null){
			updateArticleView(args.getInt(ARG_POSITION));
		}else if(mCurrentPosition != -1){
			updateArticleView(mCurrentPosition);
		}
		
	}
	
	
	public void updateArticleView(int position){
		TextView article = (TextView) getActivity().findViewById(R.id.article);
		article.setText(Lipsum.Articles[position]);
		mCurrentPosition = position;
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState){
		super.onSaveInstanceState(outState);
		outState.putInt(ARG_POSITION, mCurrentPosition);
	}
	
}
