package com.example.troisapp;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class GetSetProduct implements Parcelable {
    String picture;
    String product;
    String price;

    public GetSetProduct(String picture, String product, String price) {
        this.picture = picture;
        this.product = product;
        this.price = price;
    }

    protected GetSetProduct(Parcel in) {
        picture = in.readString();
        product = in.readString();
        price = in.readString();
    }

    public static final Creator<GetSetProduct> CREATOR = new Creator<GetSetProduct>() {
        @Override
        public GetSetProduct createFromParcel(Parcel in) {
            return new GetSetProduct(in);
        }

        @Override
        public GetSetProduct[] newArray(int size) {
            return new GetSetProduct[size];
        }
    };

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(picture);
        dest.writeString(product);
        dest.writeString(price);
    }
}
