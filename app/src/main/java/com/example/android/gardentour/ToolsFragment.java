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

public class ToolsFragment extends Fragment {
    //required empty constructor
    public ToolsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //create ArrayList to hold objects of the Podcast class, and add objects to the ArrayList
        final ArrayList<GardenItem> gardenItems = new ArrayList<GardenItem>();

        gardenItems.add(new GardenItem(R.drawable.watering_can, getResources().getString(R.string.watering_can), getResources().getString(R.string.medium), getResources().getString(R.string.watering_can_use), getResources().getString(R.string.yes)));
        gardenItems.add(new GardenItem(R.drawable.rake, getResources().getString(R.string.rake), getResources().getString(R.string.big), getResources().getString(R.string.rake_use), getResources().getString(R.string.no)));
        gardenItems.add(new GardenItem(R.drawable.fork, getResources().getString(R.string.fork), getResources().getString(R.string.small), getResources().getString(R.string.fork_use), getResources().getString(R.string.yes)));
        gardenItems.add(new GardenItem(R.drawable.trowel, getResources().getString(R.string.trowel), getResources().getString(R.string.small), getResources().getString(R.string.trowel_use), getResources().getString(R.string.yes)));
        gardenItems.add(new GardenItem(R.drawable.hose, getResources().getString(R.string.hose), getResources().getString(R.string.big), getResources().getString(R.string.hose_use), getResources().getString(R.string.yes)));
        gardenItems.add(new GardenItem(R.drawable.pruner, getResources().getString(R.string.pruner), getResources().getString(R.string.small), getResources().getString(R.string.pruner_use), getResources().getString(R.string.no)));

        //create custom adapter
        GardenItemAdapter adapter = new GardenItemAdapter(getActivity(), gardenItems);
        //intitialise listView object
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        //set the itemsAdapter to the listView
        listView.setAdapter(adapter);

        return rootView;
    }
}
