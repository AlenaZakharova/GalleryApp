package com.example.user.galleryapp;

import android.os.Parcel;
import android.os.Parcelable;

public class ImageData implements Parcelable {

    private String mUrl;

    public ImageData(String url) {
        mUrl = url;
    }

    protected ImageData(Parcel in) {
        mUrl = in.readString();
    }

    public static final Creator<ImageData> CREATOR = new Creator<ImageData>() {
        @Override
        public ImageData createFromParcel(Parcel in) {
            return new ImageData(in);
        }

        @Override
        public ImageData[] newArray(int size) {
            return new ImageData[size];
        }
    };

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public static  ImageData[] getSpacePhotos() {

        return new ImageData[]{
                new ImageData("http://i.imgur.com/zuG2bGQ.jpg"),
                new ImageData("http://i.imgur.com/ovr0NAF.jpg"),
                new ImageData("http://i.imgur.com/n6RfJX2.jpg"),
                new ImageData("http://i.imgur.com/qpr5LR2.jpg"),
                new ImageData("http://i.imgur.com/pSHXfu5.jpg"),
                new ImageData("http://i.imgur.com/3wQcZeY.jpg"),
                new ImageData("https://pp.userapi.com/c846121/v846121148/1553b/UYtls_BWS2o.jpg"),
                new ImageData("https://pp.userapi.com/c840334/v840334161/60e3b/Ecz3T9dyunk.jpg"),
                new ImageData("https://pp.userapi.com/c617629/v617629383/120e5/faQcrIYDgvA.jpg"),
                new ImageData("https://pp.userapi.com/c625729/v625729774/4855f/hi9sS0jTIfY.jpg"),
                new ImageData("http://i.imgur.com/zuG2bGQ.jpg"),
                new ImageData("http://i.imgur.com/ovr0NAF.jpg"),
                new ImageData("http://i.imgur.com/n6RfJX2.jpg"),
                new ImageData("http://i.imgur.com/qpr5LR2.jpg"),
                new ImageData("http://i.imgur.com/pSHXfu5.jpg"),
                new ImageData("http://i.imgur.com/3wQcZeY.jpg"),
                new ImageData("http://i.imgur.com/3wQcZeY.jpg"),
                new ImageData("https://pp.userapi.com/c846121/v846121148/1553b/UYtls_BWS2o.jpg"),
                new ImageData("https://pp.userapi.com/c840334/v840334161/60e3b/Ecz3T9dyunk.jpg"),
                new ImageData("https://pp.userapi.com/c617629/v617629383/120e5/faQcrIYDgvA.jpg"),
                new ImageData("https://pp.userapi.com/c625729/v625729774/4855f/hi9sS0jTIfY.jpg"),
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mUrl);
    }
}