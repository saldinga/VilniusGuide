package com.example.android.vilniusguide;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment {

    public BaseFragment() {
        // Required empty public constructor
    }

    public View createContent(LayoutInflater inflater, ViewGroup container,
                              final ArrayList<Attraction> attractions) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), 0, attractions);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Attraction currentAttraction = attractions.get(i);
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                intent.putExtra("attractionObject", currentAttraction);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
