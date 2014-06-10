package menu;

import com.aprilvn.idoldongnhi.MainActivity;
import com.aprilvn.idoldongnhi.R;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class MenuActivity extends Activity {
	private static MenuActivity menuActivityInstance;
	GridView grid;
	String[] menuText = {
	    "Tin tức",
		"Hình ảnh",
		"Music",
		"Video",
		"Đông Nhi",
		"Lịch diễn",
		"Fanzone"
	};
	int[] imageId = {
		R.drawable.menu_news,
		R.drawable.menu_images,
		R.drawable.menu_music,
		R.drawable.menu_video,
		R.drawable.menu_profile,
		R.drawable.menu_calendar,
		R.drawable.menu_fanzone
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
		ActionBar actionBar = getActionBar();
			actionBar.hide();
		super.onCreate(savedInstanceState);
		menuActivityInstance  = this;
		setContentView(R.layout.activity_menu);
		Menu_Adapter adapter = new Menu_Adapter(MenuActivity.this, menuText, imageId);
		grid=(GridView)findViewById(R.id.grid_menu);
		grid.setAdapter(adapter);
		grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View view,
		                        int position, long id) {
				onButtonClicked(position);
			}
		});
	}
	
	public void onButtonClicked(int position){
		Intent intent = new Intent(menuActivityInstance, MainActivity.class);
		Bundle b = new Bundle();
		b.putInt("position", position); //Your id
		intent.putExtras(b); //Put your id to your next Intent
        startActivity(intent);
		Toast.makeText(MenuActivity.this, "You Clicked at " + menuText[position], Toast.LENGTH_SHORT).show();
	}

}
