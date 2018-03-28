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
public class EventsFragment extends BaseFragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.events1_title))
                .setDescription(getResources().getString(R.string.events1_description))
                .setImageResourceId(R.drawable.kino_pavasaris)
                .setRating(5f)
                .setAddress(getResources().getString(R.string.events1_address))
                .setWorkingHours(getResources().getString(R.string.events1_working_hours))
                .setTicketPrices(getResources().getString(R.string.events1_prices))
                .setPhoneNumber(getResources().getString(R.string.events1_phone_number))
                .setWebsite(getResources().getString(R.string.events1_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.events2_title))
                .setDescription(getResources().getString(R.string.events2_description))
                .setImageResourceId(R.drawable.music_day)
                .setRating(5f)
                .setAddress(getResources().getString(R.string.events2_address))
                .setWorkingHours(getResources().getString(R.string.events2_working_hours))
                .setTicketPrices(getResources().getString(R.string.events2_prices))
                .setPhoneNumber(getResources().getString(R.string.events2_phone_number))
                .setWebsite(getResources().getString(R.string.events2_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.events3_title))
                .setDescription(getResources().getString(R.string.events3_description))
                .setImageResourceId(R.drawable.kulturos_naktis)
                .setRating(5f)
                .setAddress(getResources().getString(R.string.events3_address))
                .setWorkingHours(getResources().getString(R.string.events3_working_hours))
                .setTicketPrices(getResources().getString(R.string.events3_prices))
                .setPhoneNumber(getResources().getString(R.string.events3_phone_number))
                .setWebsite(getResources().getString(R.string.events3_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.events4_title))
                .setDescription(getResources().getString(R.string.events4_description))
                .setImageResourceId(R.drawable.lietuvos_dainu_svente)
                .setRating(5f)
                .setAddress(getResources().getString(R.string.events4_address))
                .setWorkingHours(getResources().getString(R.string.events4_working_hours))
                .setTicketPrices(getResources().getString(R.string.events4_prices))
                .setPhoneNumber(getResources().getString(R.string.events4_phone_number))
                .setWebsite(getResources().getString(R.string.events4_website))
                .build());

        return createContent(inflater, container, attractions);
    }
}
