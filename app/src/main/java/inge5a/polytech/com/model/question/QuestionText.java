package inge5a.polytech.com.model.question;

import android.os.Parcel;

import java.util.ArrayList;

import inge5a.polytech.com.model.Answer;

/**
 * Created by thibault on 10/11/17.
 */

public class QuestionText extends Question {
    public QuestionText(String content, ArrayList<Answer> answers) {
        super(content, answers);
    }

    public QuestionText(Parcel in) {
        super(in);
    }


    public static final Creator<QuestionText> CREATOR = new Creator<QuestionText>() {
        @Override
        public QuestionText createFromParcel(Parcel in) {
            return new QuestionText(in);
        }

        @Override
        public QuestionText[] newArray(int size) {
            return new QuestionText[size];
        }
    };
}
