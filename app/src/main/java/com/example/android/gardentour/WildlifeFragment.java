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

public class WildlifeFragment extends Fragment {
    //required empty constructor
    public WildlifeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //create ArrayList to hold objects of the Podcast class, and add objects to the ArrayList
        final ArrayList<GardenItem> gardenItems = new ArrayList<GardenItem>();

        gardenItems.add(new GardenItem(R.drawable.bumblebee, getResources().getString(R.string.bumblebee), getResources().getString(R.string.bumblebee_color), getResources().getString(R.string.bumblebee_use)));
        gardenItems.add(new GardenItem(R.drawable.ladybird, getResources().getString(R.string.ladybird), getResources().getString(R.string.ladybird_color), getResources().getString(R.string.ladybird_use)));
        gardenItems.add(new GardenItem(R.drawable.snail, getResources().getString(R.string.snail), getResources().getString(R.string.brown), getResources().getString(R.string.snail_use)));
        gardenItems.add(new GardenItem(R.drawable.worm, getResources().getString(R.string.worm), getResources().getString(R.string.brown), getResources().getString(R.string.worm_use)));
        gardenItems.add(new GardenItem(R.drawable.butterfly, getResources().getString(R.string.butterfly), getResources().getString(R.string.various_colors), getResources().getString(R.string.butterfly_use)));
        gardenItems.add(new GardenItem(R.drawable.greenfly, getResources().getString(R.string.greenfly), getResources().getString(R.string.green), getResources().getString(R.string.greenfly_use)));

        //create custom adapter
        GardenItemAdapter adapter = new GardenItemAdapter(getActivity(), gardenItems);
        //intitialise listView object
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        //set the itemsAdapter to the listView
        listView.setAdapter(adapter);

        return rootView;
    }
}
