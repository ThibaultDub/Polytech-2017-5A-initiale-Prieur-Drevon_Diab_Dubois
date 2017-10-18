package inge5a.polytech.com.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Thomas on 11-Oct-17.
 */

public class Answer implements Parcelable {

    private String text;
    private boolean isRightAnswer;

    public Answer(String text, boolean isRightAnswer) {
        this.setText(text);
        this.setIsRightAnswer(isRightAnswer);
    }

    public Answer(Parcel in) {
        // the order needs to be the same as in writeToParcel() method
        this.setText(in.readString());
        this.setIsRightAnswer(in.readByte() != 0);
    }

    public static final Creator<Answer> CREATOR = new Creator<Answer>() {
        @Override
        public Answer createFromParcel(Parcel in) {
            return new Answer(in);
        }

        @Override
        public Answer[] newArray(int size) {
            return new Answer[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(text);
        parcel.writeByte((byte) (isRightAnswer ? 1 : 0));
    }

    public String getText() {
        return text;
    }

    public boolean isRightAnswer() {
        return isRightAnswer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setIsRightAnswer(boolean rightAnswer) {
        isRightAnswer = rightAnswer;
    }
}
