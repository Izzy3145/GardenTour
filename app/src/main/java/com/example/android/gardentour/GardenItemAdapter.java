package com.example.android.gardentour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by izzystannett on 21/05/2017.
 */

public class GardenItemAdapter extends ArrayAdapter<GardenItem> {

    //create a constructor that removes the layout TextView requirement
    public GardenItemAdapter(Activity context, ArrayList<GardenItem> gardenItems) {
        super(context, 0, gardenItems);
    }

    //override the getView method so we are not limited to passing just one TextView in
    //to the ListView
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // get the gardenItem object in this position in the list
        GardenItem currentItem = getItem(position);

        // define the current selected view as an object of the view class
        //check if the view is being reused, if not inflate it
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_page, parent, false);
        }

        //create objects for each of the views in the fragment_page, assign them to the listItemView
        //check the attribute is applicable, and if so, pass in the currentItem's details

        ImageView objectImageView = (ImageView) listItemView.findViewById(R.id.object_image);
        objectImageView.setImageResource(currentItem.getmImageResourceID());

        TextView objectNameTextView = (TextView) listItemView.findViewById(R.id.object_name);
        objectNameTextView.setText(currentItem.getmName());

        TextView objectColorTextView = (TextView) listItemView.findViewById(R.id.object_color);
        TextView colorTagTextView = (TextView) listItemView.findViewById(R.id.color_tag);
        if (currentItem.hasColor()) {
            objectColorTextView.setText(currentItem.getmColor());
            // Make sure the view is visible
            objectColorTextView.setVisibility(View.VISIBLE);
            colorTagTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            objectColorTextView.setVisibility(View.GONE);
            colorTagTextView.setVisibility(View.GONE);
        }

        TextView numberOfPetalsTextView = (TextView) listItemView.findViewById(R.id.number_of_petals);
        TextView petalsTagTextView = (TextView) listItemView.findViewById(R.id.petals_tag);
        if (currentItem.hasNumberOfPetals()) {
            numberOfPetalsTextView.setText(currentItem.getmNumberOfPetals());
            // Make sure the view is visible
            numberOfPetalsTextView.setVisibility(View.VISIBLE);
            petalsTagTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            numberOfPetalsTextView.setVisibility(View.GONE);
            petalsTagTextView.setVisibility(View.GONE);
        }

        TextView sizeTextView = (TextView) listItemView.findViewById(R.id.size);
        TextView sizeTagTextView = (TextView) listItemView.findViewById(R.id.size_tag);
        if (currentItem.hasSize()) {
            sizeTextView.setText(currentItem.getmSize());
            // Make sure the view is visible
            sizeTextView.setVisibility(View.VISIBLE);
            sizeTagTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            sizeTextView.setVisibility(View.GONE);
            sizeTagTextView.setVisibility(View.GONE);
        }

        TextView isGoodForTextView = (TextView) listItemView.findViewById(R.id.is_good_for);
        TextView goodForTagTextView = (TextView) listItemView.findViewById(R.id.good_for_tag);
        if (currentItem.hasIsGoodFor()) {
            isGoodForTextView.setText(currentItem.getmIsGoodFor());
            // Make sure the view is visible
            isGoodForTextView.setVisibility(View.VISIBLE);
            goodForTagTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            isGoodForTextView.setVisibility(View.GONE);
            goodForTagTextView.setVisibility(View.GONE);
        }

        TextView isChildFriendlyTextView = (TextView) listItemView.findViewById(R.id.is_child_friendly);
        TextView childFriendlyTagTextView = (TextView) listItemView.findViewById(R.id.child_friendly_tag);
        if (currentItem.hasIsChildFriendly()) {
            isChildFriendlyTextView.setText(currentItem.getmIsChildFriendly());
            // Make sure the view is visible
            isChildFriendlyTextView.setVisibility(View.VISIBLE);
            childFriendlyTagTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            isChildFriendlyTextView.setVisibility(View.GONE);
            childFriendlyTagTextView.setVisibility(View.GONE);
        }

        // return the list item
        return listItemView;
    }
}
