package com.example.android.gardentour;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.fragment;


/**
 * A simple {@link Fragment} subclass.
 */

public class VegetablesFragment extends Fragment {
    //required empty constructor
    public VegetablesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //create ArrayList to hold objects of the Podcast class, and add objects to the ArrayList
        final ArrayList<GardenItem> gardenItems = new ArrayList<GardenItem>();

        gardenItems.add(new GardenItem(R.drawable.carrot, getResources().getString(R.string
                .carrot), getResources().getString(R.string
                .orange), getResources().getString(R.string
                .carrot_use)));
        gardenItems.add(new GardenItem(R.drawable.beetroot, getResources().getString(R.string
                .beetroot), getResources().getString(R.string
                .purple), getResources().getString(R.string
                .beetroot_use)));
        gardenItems.add(new GardenItem(R.drawable.cabbage, getResources().getString(R.string
                .cabbage), getResources().getString(R.string
                .white), getResources().getString(R.string
                .cabbage_use)));
        gardenItems.add(new GardenItem(R.drawable.chilli, getResources().getString(R.string
                .chilli), getResources().getString(R.string
                .chilli_color), getResources().getString(R.string
                .chilli_use)));
        gardenItems.add(new GardenItem(R.drawable.onion, getResources().getString(R.string
                .onion), getResources().getString(R.string
                .onion_color), getResources().getString(R.string
                .onion_use)));
        gardenItems.add(new GardenItem(R.drawable.aubergine, getResources().getString(R.string
                .aubergine), getResources().getString(R.string
                .purple), getResources().getString(R.string
                .aubergine_use)));

        //create custom adapter
        GardenItemAdapter adapter = new GardenItemAdapter(getActivity(), gardenItems);
        //intitialise listView object
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        //set the itemsAdapter to the listView
        listView.setAdapter(adapter);

        return rootView;
    }
}
