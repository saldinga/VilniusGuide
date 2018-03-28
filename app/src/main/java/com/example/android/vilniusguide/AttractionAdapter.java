package com.example.android.vilniusguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Inga on 2018-03-21.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Attraction> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link com.example.android.vilniusguide.Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        //Set title
        TextView title = listItemView.findViewById(R.id.list_item_title);
        title.setText(currentAttraction.getTitle());

        //set description
        TextView description = listItemView.findViewById(R.id.list_item_description);
        description.setText(currentAttraction.getDescription());

        //set image resource id
        ImageView imageView = listItemView.findViewById(R.id.list_item_image);
        imageView.setImageResource(currentAttraction.getImageResourceId());

        //set rating value
        RatingBar ratingBar = listItemView.findViewById(R.id.ratingBar);
        ratingBar.setRating(currentAttraction.getRating());

        return listItemView;
    }
}
