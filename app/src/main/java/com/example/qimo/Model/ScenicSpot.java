package com.example.qimo.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @project qimo
 * @package：com.example.qimo.Model
 * @anthor xiangxia
 * @time 4/28/22 3:34 PM
 * @description 描述
 */
public class ScenicSpot implements Parcelable {
    public int img;
    public String title;
    public String subtitle;
    public String detail;
    public String time;
    public String address;
    public String phone;

    public ScenicSpot() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(img);
        dest.writeString(title);
        dest.writeString(subtitle);
        dest.writeString(detail);
        dest.writeString(time);
        dest.writeString(address);
        dest.writeString(phone);
    }

    protected ScenicSpot(Parcel in) {
        img = in.readInt();
        title = in.readString();
        subtitle = in.readString();
        detail = in.readString();
        time = in.readString();
        address = in.readString();
        phone = in.readString();
    }

    public static final Creator<ScenicSpot> CREATOR = new Creator<ScenicSpot>() {
        @Override
        public ScenicSpot createFromParcel(Parcel in) {
            return new ScenicSpot(in);
        }

        @Override
        public ScenicSpot[] newArray(int size) {
            return new ScenicSpot[size];
        }
    };
}
