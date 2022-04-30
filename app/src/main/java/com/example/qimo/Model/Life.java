package com.example.qimo.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @ProjectName: qimo
 * @Package: com.example.qimo.Model
 * @ClassName: Life
 * @Description: java类作用描述
 * @Author: xiang xia
 * @CreateDate: 2022/4/28 11:08 下午
 * @UpdateUser: 更新者
 * @UpdateDate: 2022/4/28 11:08 下午
 * @UpdateRemark: 更新说明
 * @Version: 1.0.0
 */
public class Life implements Parcelable {
    public int img;
    public String title;
    public String subtitle;
    public String detail;
    public String star;
    public String time;
    public String keywords;
    public String recommend;
    public String recommend_title;
    public String phone;
    public String address;

    public Life() {

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
        dest.writeString(star);
        dest.writeString(time);
        dest.writeString(keywords);
        dest.writeString(recommend);
        dest.writeString(recommend_title);
        dest.writeString(phone);
        dest.writeString(address);
    }

    protected Life(Parcel in) {
        img = in.readInt();
        title = in.readString();
        subtitle = in.readString();
        detail = in.readString();
        star = in.readString();
        time = in.readString();
        keywords = in.readString();
        recommend = in.readString();
        recommend_title = in.readString();
        phone = in.readString();
        address = in.readString();
    }

    public static final Creator<Life> CREATOR = new Creator<Life>() {
        @Override
        public Life createFromParcel(Parcel in) {
            return new Life(in);
        }

        @Override
        public Life[] newArray(int size) {
            return new Life[size];
        }
    };

}
