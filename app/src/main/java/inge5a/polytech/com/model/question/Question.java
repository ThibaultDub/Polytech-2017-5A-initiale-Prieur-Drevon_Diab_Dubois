package inge5a.polytech.com.model.question;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

import inge5a.polytech.com.model.Answer;

/**
 * Created by Thomas on 11-Oct-17.
 */

public abstract class Question implements Parcelable {
    private String content;
    private List<Answer> answers;
    private int difficulty;

    public Question(String content, ArrayList<Answer> answers) {
        this.setContent(content);
        this.setAnswers(answers);
    }

    public Question(Parcel in) {
        // the order needs to be the same as in writeToParcel() method
        this.setContent(in.readString());
        this.setDifficulty(in.readInt());
        this.setAnswers(in.createTypedArrayList(Question.CREATOR));
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
        parcel.writeString(this.getContent());
        parcel.writeInt(this.getDifficulty());
        parcel.writeTypedList(this.getAnswers());
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public int getPointsEarned(Answer a){
        if (a.isRightAnswer()) {
            return this.getDifficulty();
        } else {
            return 0;
        }
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
