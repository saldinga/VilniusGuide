package com.example.android.vilniusguide;

import java.io.Serializable;

public class Attraction implements Serializable {

    // Title of attraction
    private String mTitle;

    // Description of attraction
    private String mDescription;

    //Image of attraction
    private int mImageResourceId;

    //Rating of attraction
    private float mRating;

    // Working hours
    private String mWorkingHours;

    //Prices
    private String mTicketPrices;

    //address
    private String mAddress;

    //phone
    private String mPhoneNumber;

    //website
    private String mWebsite;

    private Attraction(AttractionBuilder builder) {
        this.mTitle = builder.nTitle;
        this.mDescription = builder.nDescription;
        this.mImageResourceId = builder.nImageResourceId;
        this.mRating = builder.nRating;
        this.mAddress = builder.nAddress;
        this.mWorkingHours = builder.nWorkingHours;
        this.mTicketPrices = builder.nTicketPrices;
        this.mPhoneNumber = builder.nPhoneNumber;
        this.mWebsite = builder.nWebsite;
    }

    /*
     * Create attraction object
     */

    // Extract the title of the attraction
    public String getTitle() {
        return mTitle;
    }

    // Extract the description of the attraction
    public String getDescription() {
        return mDescription;
    }

    //Extract the resource id of image of attraction
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Extract the rating of attraction
    public float getRating() {
        return mRating;
    }

    //Extract working hours
    public String getWorkingHours() {
        return mWorkingHours;
    }

    //Extract prices
    public String getTicketPrices() {
        return mTicketPrices;
    }

    //Extract address
    public String getAddress() {
        return mAddress;
    }

    //Extract phone number
    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    //Extract website
    public String getWebsite() {
        return mWebsite;
    }

    public static class AttractionBuilder {

        // Title of attraction
        private String nTitle;

        // Description of attraction
        private String nDescription;

        //Image of attraction
        private int nImageResourceId;

        //Rating of attraction
        private float nRating;

        // Working hours
        private String nWorkingHours;

        //Prices
        private String nTicketPrices;

        //address
        private String nAddress;

        //phone
        private String nPhoneNumber;

        //website
        private String nWebsite;

        public AttractionBuilder() {
            // TODO Empty constructor
        }

        public AttractionBuilder setTitle(String title) {
            this.nTitle = title;
            return this;
        }

        public AttractionBuilder setDescription(String description) {
            this.nDescription = description;
            return this;
        }

        public AttractionBuilder setImageResourceId(int imageResourceId) {
            this.nImageResourceId = imageResourceId;
            return this;
        }

        public AttractionBuilder setRating(float rating) {
            this.nRating = rating;
            return this;
        }

        public AttractionBuilder setAddress(String address) {
            this.nAddress = address;
            return this;
        }

        public AttractionBuilder setWorkingHours(String workingHours) {
            this.nWorkingHours = workingHours;
            return this;
        }

        public AttractionBuilder setTicketPrices(String ticketPrices) {
            this.nTicketPrices = ticketPrices;
            return this;
        }

        public AttractionBuilder setPhoneNumber(String phoneNumber) {
            this.nPhoneNumber = phoneNumber;
            return this;
        }

        public AttractionBuilder setWebsite(String website) {
            this.nWebsite = website;
            return this;
        }

        public Attraction build() {
            return new Attraction(this);
        }
    }
}
