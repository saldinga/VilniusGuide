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
public class RestaurantsFragment extends BaseFragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.eat1_title))
                .setDescription(getResources().getString(R.string.eat1_description))
                .setImageResourceId(R.drawable.dziaugsmas)
                .setRating(5f)
                .setAddress(getResources().getString(R.string.eat1_address))
                .setWorkingHours(getResources().getString(R.string.eat1_working_hours))
                .setTicketPrices(getResources().getString(R.string.eat1_prices))
                .setPhoneNumber(getResources().getString(R.string.eat1_phone_number))
                .setWebsite(getResources().getString(R.string.eat1_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.eat2_title))
                .setDescription(getResources().getString(R.string.eat2_description))
                .setImageResourceId(R.drawable.sturmu_svyturys)
                .setRating(5f)
                .setAddress(getResources().getString(R.string.eat2_address))
                .setWorkingHours(getResources().getString(R.string.eat2_working_hours))
                .setTicketPrices(getResources().getString(R.string.eat2_prices))
                .setPhoneNumber(getResources().getString(R.string.eat2_phone_number))
                .setWebsite(getResources().getString(R.string.eat2_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.eat3_title))
                .setDescription(getResources().getString(R.string.eat3_description))
                .setImageResourceId(R.drawable.dine)
                .setRating(5f)
                .setAddress(getResources().getString(R.string.eat3_address))
                .setWorkingHours(getResources().getString(R.string.eat3_working_hours))
                .setTicketPrices(getResources().getString(R.string.eat3_prices))
                .setPhoneNumber(getResources().getString(R.string.eat3_phone_number))
                .setWebsite(getResources().getString(R.string.eat3_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.eat4_title))
                .setDescription(getResources().getString(R.string.eat4_description))
                .setImageResourceId(R.drawable.sweet_root)
                .setRating(5f)
                .setAddress(getResources().getString(R.string.eat4_address))
                .setWorkingHours(getResources().getString(R.string.eat4_working_hours))
                .setTicketPrices(getResources().getString(R.string.eat4_prices))
                .setPhoneNumber(getResources().getString(R.string.eat4_phone_number))
                .setWebsite(getResources().getString(R.string.eat4_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.eat5_title))
                .setDescription(getResources().getString(R.string.eat5_description))
                .setImageResourceId(R.drawable.gaspars)
                .setRating(5f)
                .setAddress(getResources().getString(R.string.eat5_address))
                .setWorkingHours(getResources().getString(R.string.eat5_working_hours))
                .setTicketPrices(getResources().getString(R.string.eat5_prices))
                .setPhoneNumber(getResources().getString(R.string.eat5_phone_number))
                .setWebsite(getResources().getString(R.string.eat5_website))
                .build());

        attractions.add(new Attraction.AttractionBuilder()
                .setTitle(getResources().getString(R.string.eat6_title))
                .setDescription(getResources().getString(R.string.eat6_description))
                .setImageResourceId(R.drawable.stebuklai)
                .setRating(5f)
                .setAddress(getResources().getString(R.string.eat6_address))
                .setWorkingHours(getResources().getString(R.string.eat6_working_hours))
                .setTicketPrices(getResources().getString(R.string.eat6_prices))
                .setPhoneNumber(getResources().getString(R.string.eat6_phone_number))
                .setWebsite(getResources().getString(R.string.eat6_website))
                .build());

        return createContent(inflater, container, attractions);
    }
}
