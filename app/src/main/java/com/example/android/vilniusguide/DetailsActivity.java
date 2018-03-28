package com.example.android.vilniusguide;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private static final int REQUEST_CALL = 1;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        final Attraction attraction = (Attraction) getIntent().getSerializableExtra("attractionObject");

        ImageView imageView = findViewById(R.id.detail_image);
        imageView.setImageResource(attraction.getImageResourceId());

        TextView titleTextView = findViewById(R.id.detail_title);
        titleTextView.setText(attraction.getTitle());

        TextView addressTextView = findViewById(R.id.detail_address);
        addressTextView.setText(attraction.getAddress());

        TextView infoTextView = findViewById(R.id.details_info);
        infoTextView.setText(attraction.getDescription());

        TextView workingHoursTextView = findViewById(R.id.working_hours);
        workingHoursTextView.setText(attraction.getWorkingHours());

        TextView ticketPricesTextView = findViewById(R.id.ticket_prices);
        ticketPricesTextView.setText(attraction.getTicketPrices());

        mContext = this;

        final String phoneNumber = attraction.getPhoneNumber();
        TextView callTextView = findViewById(R.id.call);

        if (!phoneNumber.equals("")) {

            callTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + phoneNumber));
                    if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                        ActivityCompat.requestPermissions(DetailsActivity.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);

                    } else {
                        startActivity(callIntent);
                    }
                }
            });
        } else {
            callTextView.setVisibility(View.GONE);
        }

        TextView websiteTextView = findViewById(R.id.website);
        websiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String website = attraction.getWebsite();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse(website));
                startActivity(browserIntent);
            }
        });

        TextView mapTextView = findViewById(R.id.map);

        if (!phoneNumber.equals("")) {

            mapTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String address = attraction.getAddress();
                    address = address.replaceAll(" ", "+");
                    Uri gmmIntentUri = Uri.parse("geo:54.6872,25.2797?q=" + address);
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);
                }
            });
        } else {
            mapTextView.setVisibility(View.GONE);
        }
    }
}
