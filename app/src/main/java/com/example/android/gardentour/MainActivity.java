package com.example.android.gardentour;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // make an instance of the viewpager class that will allow scrolling between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //create an adapter with appropriate fragments assigned to each page
        SamplePagerAdapter pagerAdapter = new SamplePagerAdapter(getSupportFragmentManager(), MainActivity.this);

        //set the adapter to the view pager
        viewPager.setAdapter(pagerAdapter);

        //link the tab layout with the view pager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.top_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
