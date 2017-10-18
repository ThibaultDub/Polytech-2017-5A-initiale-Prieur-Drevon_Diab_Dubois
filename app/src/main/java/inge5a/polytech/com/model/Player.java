package inge5a.polytech.com.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Thomas on 11-Oct-17.
 */

public class Player implements Parcelable {

    private String name;

    public Player(String name) {
        this.setName(name);
    }

    protected Player(Parcel in) {
        setName(in.readString());
    }

    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getName());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
