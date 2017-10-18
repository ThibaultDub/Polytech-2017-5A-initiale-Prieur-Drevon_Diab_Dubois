package inge5a.polytech.com.model.question;

import android.os.Parcel;

import java.util.ArrayList;

import inge5a.polytech.com.model.Answer;

/**
 * Created by thibault on 10/11/17.
 */

public class QuestionVideo extends Question {
    public QuestionVideo(String content, ArrayList<Answer> answers) {
        super(content, answers);
    }
    //TODO add video support

    public QuestionVideo(Parcel in) {
        super(in);
    }


    public static final Creator<QuestionVideo> CREATOR = new Creator<QuestionVideo>() {
        @Override
        public QuestionVideo createFromParcel(Parcel in) {
            return new QuestionVideo(in);
        }

        @Override
        public QuestionVideo[] newArray(int size) {
            return new QuestionVideo[size];
        }
    };
}
