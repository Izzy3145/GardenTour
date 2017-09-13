package com.example.android.gardentour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SamplePagerAdapter extends FragmentPagerAdapter {
    //set context
    private Context context;

    //set tab titles as an array, to be referenced by getPageTitle method
    private String tabTitles[] = new String[]{"Flowers", "Vegetables", "Wildlife", "Tools"};

    //set up constructor
    public SamplePagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    //determine which fragment to display at each position
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FlowersFragment();
        } else if (position == 1) {
            return new VegetablesFragment();
        } else if (position == 2) {
            return new WildlifeFragment();
        } else {
            return new ToolsFragment();
        }
    }

    //set the page titles
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    //set the number of pages to be assigned to the adapter
    @Override
    public int getCount() {
        return 4;
    }
}