package com.example.android.vilniusguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends BaseFragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.poi1_title))
                .setDescription(getResources().getString(R.string.poi1_description))
                .setImageResourceId(R.drawable.gediminas_tower)
                .setRating(4.8f)
                .setAddress(getResources().getString(R.string.poi1_address))
                .setWorkingHours(getResources().getString(R.string.poi1_working_hours))
                .setTicketPrices(getResources().getString(R.string.poi1_tickets))
                .setPhoneNumber(getResources().getString(R.string.poi1_phone_number))
                .setWebsite(getResources().getString(R.string.poi1_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.poi2_title))
                .setDescription(getResources().getString(R.string.poi2_description))
                .setImageResourceId(R.drawable.gates_of_dawn)
                .setRating(4.7f)
                .setAddress(getResources().getString(R.string.poi2_address))
                .setWorkingHours(getResources().getString(R.string.poi2_working_hours))
                .setTicketPrices(getResources().getString(R.string.poi2_tickets))
                .setPhoneNumber(getResources().getString(R.string.poi2_phone_number))
                .setWebsite(getResources().getString(R.string.poi2_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.poi3_title))
                .setDescription(getResources().getString(R.string.poi3_description))
                .setImageResourceId(R.drawable.cathedral)
                .setRating(4.9f)
                .setAddress(getResources().getString(R.string.poi3_address))
                .setWorkingHours(getResources().getString(R.string.poi3_working_hours))
                .setTicketPrices(getResources().getString(R.string.poi3_tickets))
                .setPhoneNumber(getResources().getString(R.string.poi3_phone_number))
                .setWebsite(getResources().getString(R.string.poi3_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.poi4_title))
                .setDescription(getResources().getString(R.string.poi4_description))
                .setImageResourceId(R.drawable.anne_church)
                .setRating(4.5f)
                .setAddress(getResources().getString(R.string.poi4_address))
                .setWorkingHours(getResources().getString(R.string.poi4_working_hours))
                .setTicketPrices(getResources().getString(R.string.poi4_tickets))
                .setPhoneNumber(getResources().getString(R.string.poi4_phone_number))
                .setWebsite(getResources().getString(R.string.poi4_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.poi5_title))
                .setDescription(getResources().getString(R.string.poi5_description))
                .setImageResourceId(R.drawable.tv_tower)
                .setRating(4.6f)
                .setAddress(getResources().getString(R.string.poi5_address))
                .setWorkingHours(getResources().getString(R.string.poi5_working_hours))
                .setTicketPrices(getResources().getString(R.string.poi5_tickets))
                .setPhoneNumber(getResources().getString(R.string.poi5_phone_number))
                .setWebsite(getResources().getString(R.string.poi5_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.poi6_title))
                .setDescription(getResources().getString(R.string.poi6_description))
                .setImageResourceId(R.drawable.three_crosses)
                .setRating(4.4f)
                .setAddress(getResources().getString(R.string.poi6_address))
                .setWorkingHours(getResources().getString(R.string.poi6_working_hours))
                .setTicketPrices(getResources().getString(R.string.poi6_tickets))
                .setPhoneNumber(getResources().getString(R.string.poi6_phone_number))
                .setWebsite(getResources().getString(R.string.poi6_website))
                .build());

        return createContent(inflater, container, attractions);
    }
}
