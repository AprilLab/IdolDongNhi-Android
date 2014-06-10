package com.aprilvn.idoldongnhi;


import profile.DongNhiFragment;
import schedule.ScheduleFragment;
import video.VideoFragment;
import fanzone.FanZoneFragment;
import gallery.AlbumsPhotoFragment;
import music.AlbumsMusicFragment;
import news.NewsFragment;
import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Window;


public class MainActivity extends FragmentActivity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Bundle b = getIntent().getExtras();
		if(b != null){
			int position = b.getInt("position");
			Log.v("position", "" + position);
			changeFragmentByMenuId(position);
		}
	}
	  
  	private void changeFragmentByMenuId(int position){
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		if(position == 0){
			NewsFragment newsFragment = new NewsFragment();
			ft.replace(R.id.content_fragment, newsFragment, "newsFragment");
		}else if(position == 1){
			AlbumsPhotoFragment albumPhotoFragment = new AlbumsPhotoFragment();
			ft.replace(R.id.content_fragment, albumPhotoFragment, "albumPhotoFragment");
		}else if(position == 2){
			AlbumsMusicFragment albumMusicFragment = new AlbumsMusicFragment();
			ft.replace(R.id.content_fragment, albumMusicFragment, "albumMusicFragment");
		}else if(position == 3){
			VideoFragment videoFragment = new VideoFragment();
			ft.replace(R.id.content_fragment, videoFragment, "videoFragment");
		}else if(position == 4){
			DongNhiFragment dongnhiFragment = new DongNhiFragment();
			ft.replace(R.id.content_fragment, dongnhiFragment, "dongnhiFragment");
		}else if(position == 5){
			ScheduleFragment scheduleFragment = new ScheduleFragment();
			ft.replace(R.id.content_fragment, scheduleFragment, "scheduleFragment");
		}else if(position == 6){
			FanZoneFragment fanzoneFragment = new FanZoneFragment();
			ft.replace(R.id.content_fragment, fanzoneFragment, "fanzoneFragment");
		}
		ft.addToBackStack(null);
		ft.commit(); 
	}
	  
}
