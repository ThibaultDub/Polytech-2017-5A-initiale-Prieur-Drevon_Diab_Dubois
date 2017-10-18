package inge5a.polytech.com.model.question;

import android.os.Parcel;

import java.util.ArrayList;

import inge5a.polytech.com.model.Answer;

/**
 * Created by thibault on 10/11/17.
 */

public class QuestionImage extends Question {
    public QuestionImage(String content, ArrayList<Answer> answers) {
        super(content, answers);
    }
    //TODO add image support

    public QuestionImage(Parcel in) {
        super(in);
    }


    public static final Creator<QuestionImage> CREATOR = new Creator<QuestionImage>() {
        @Override
        public QuestionImage createFromParcel(Parcel in) {
            return new QuestionImage(in);
        }

        @Override
        public QuestionImage[] newArray(int size) {
            return new QuestionImage[size];
        }
    };
}
