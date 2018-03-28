package com.example.android.vilniusguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Inga on 2018-03-23.
 */

public class CustomPagerAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    public CustomPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public CustomPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PlacesFragment();
            case 1:
                return new HotelsFragment();
            case 2:
                return new RestaurantsFragment();
            default:
                return new EventsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.poi_category_name);
            case 1:
                return mContext.getString(R.string.hotels_category_name);
            case 2:
                return mContext.getString(R.string.eat_category_name);
            default:
                return mContext.getString(R.string.events_category_name);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
