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
public class HotelsFragment extends BaseFragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.hotel1_title))
                .setDescription(getResources().getString(R.string.hotel1_description))
                .setImageResourceId(R.drawable.urbihop_hotel)
                .setRating(4.3f)
                .setAddress(getResources().getString(R.string.hotel1_address))
                .setWorkingHours(getResources().getString(R.string.hotel1_working_hours))
                .setTicketPrices(getResources().getString(R.string.hotel1_prices))
                .setPhoneNumber(getResources().getString(R.string.hotel1_phone_number))
                .setWebsite(getResources().getString(R.string.hotel1_website))
                .build());


        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.hotel2_title))
                .setDescription(getResources().getString(R.string.hotel2_description))
                .setImageResourceId(R.drawable.hotel_tilto)
                .setRating(4.45f)
                .setAddress(getResources().getString(R.string.hotel2_address))
                .setWorkingHours(getResources().getString(R.string.hotel2_working_hours))
                .setTicketPrices(getResources().getString(R.string.hotel2_prices))
                .setPhoneNumber(getResources().getString(R.string.hotel2_phone_number))
                .setWebsite(getResources().getString(R.string.hotel2_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.hotel3_title))
                .setDescription(getResources().getString(R.string.hotel3_description))
                .setImageResourceId(R.drawable.artagonist_hotel)
                .setRating(4.8f)
                .setAddress(getResources().getString(R.string.hotel3_address))
                .setWorkingHours(getResources().getString(R.string.hotel3_working_hours))
                .setTicketPrices(getResources().getString(R.string.hotel3_prices))
                .setPhoneNumber(getResources().getString(R.string.hotel3_phone_number))
                .setWebsite(getResources().getString(R.string.hotel3_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.hotel4_title))
                .setDescription(getResources().getString(R.string.hotel4_description))
                .setImageResourceId(R.drawable.artis_centrum_hotel)
                .setRating(4.35f)
                .setAddress(getResources().getString(R.string.hotel4_address))
                .setWorkingHours(getResources().getString(R.string.hotel4_working_hours))
                .setTicketPrices(getResources().getString(R.string.hotel4_prices))
                .setPhoneNumber(getResources().getString(R.string.hotel4_phone_number))
                .setWebsite(getResources().getString(R.string.hotel4_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.hotel5_title))
                .setDescription(getResources().getString(R.string.hotel5_description))
                .setImageResourceId(R.drawable.airinn_vilnius_hotel)
                .setRating(4.25f)
                .setAddress(getResources().getString(R.string.hotel5_address))
                .setWorkingHours(getResources().getString(R.string.hotel5_working_hours))
                .setTicketPrices(getResources().getString(R.string.hotel5_prices))
                .setPhoneNumber(getResources().getString(R.string.hotel5_phone_number))
                .setWebsite(getResources().getString(R.string.hotel5_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.hotel6_title))
                .setDescription(getResources().getString(R.string.hotel6_description))
                .setImageResourceId(R.drawable.shakespeare_hotel)
                .setRating(4.6f)
                .setAddress(getResources().getString(R.string.hotel6_address))
                .setWorkingHours(getResources().getString(R.string.hotel6_working_hours))
                .setTicketPrices(getResources().getString(R.string.hotel6_prices))
                .setPhoneNumber(getResources().getString(R.string.hotel6_phone_number))
                .setWebsite(getResources().getString(R.string.hotel6_website))
                .build());

        return createContent(inflater, container, attractions);
    }
}
