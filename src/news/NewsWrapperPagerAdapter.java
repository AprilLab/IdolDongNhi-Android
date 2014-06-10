package news;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class NewsWrapperPagerAdapter extends FragmentPagerAdapter{
	public NewsWrapperPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Top Rated fragment activity
        	return new NewsCollectionFragment();
        case 1:
        	// Games fragment activity
        	return new NewsDongNhiCollectionFragment();
        }
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
    	return 2;
    }
}
