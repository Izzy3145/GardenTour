package com.example.android.gardentour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */

public class FlowersFragment extends Fragment {
    //required empty constructor
    public FlowersFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //create ArrayList to hold objects of the Podcast class, and add objects to the ArrayList
        final ArrayList<GardenItem> gardenItems = new ArrayList<GardenItem>();

        gardenItems.add(new GardenItem(R.drawable.rose, getResources().getString(R.string
                .rose), getResources().getString(R.string
                .various_colors), 20));
        gardenItems.add(new GardenItem(R.drawable.buttercup, getResources().getString(R.string
                .buttercup), getResources().getString(R.string
                .yellow), 5));
        gardenItems.add(new GardenItem(R.drawable.daisy, getResources().getString(R.string
                .daisy), getResources().getString(R.string
                .white), 34));
        gardenItems.add(new GardenItem(R.drawable.pansy, getResources().getString(R.string
                .pansy), getResources().getString(R.string
                .various_colors), 5));
        gardenItems.add(new GardenItem(R.drawable.foxglove, getResources().getString(R.string
                .foxglove), getResources().getString(R.string
                .pink), 4));
        gardenItems.add(new GardenItem(R.drawable.marigold, getResources().getString(R.string
                .marigold), getResources().getString(R.string
                .orange), 14));

        //create custom adapter
        GardenItemAdapter adapter = new GardenItemAdapter(getActivity(), gardenItems);
        //intitialise listView object
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        //set the itemsAdapter to the listView
        listView.setAdapter(adapter);

        return rootView;
    }
}
