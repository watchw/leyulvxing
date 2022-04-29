package com.example.qimo.Model;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * @project qimo
 * @package：com.example.qimo.Model
 * @anthor xiangxia
 * @time 4/29/22 1:45 PM
 * @description 描述
 */
public class News implements Parcelable {
    public int img;
    public String title;
    public String source;
    public String time;
    public String detail;

    public News() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(img);
        dest.writeString(title);
        dest.writeString(source);
        dest.writeString(time);
        dest.writeString(detail);
    }

    protected News(Parcel in) {
        img = in.readInt();
        title = in.readString();
        source = in.readString();
        time = in.readString();
        detail = in.readString();
    }

    public static final Creator<News> CREATOR = new Creator<News>() {
        @Override
        public News createFromParcel(Parcel in) {
            return new News(in);
        }

        @Override
        public News[] newArray(int size) {
            return new News[size];
        }
    };
}
