package inge5a.polytech.com.model.question;

import android.os.Parcel;

import java.util.ArrayList;

import inge5a.polytech.com.model.Answer;

/**
 * Created by thibault on 10/11/17.
 */

public class QuestionSound extends Question {
    public QuestionSound(String content, ArrayList<Answer> answers) {
        super(content, answers);
    }
    //TODO add sound support

    public QuestionSound(Parcel in) {
        super(in);
    }


    public static final Creator<QuestionSound> CREATOR = new Creator<QuestionSound>() {
        @Override
        public QuestionSound createFromParcel(Parcel in) {
            return new QuestionSound(in);
        }

        @Override
        public QuestionSound[] newArray(int size) {
            return new QuestionSound[size];
        }
    };
}
