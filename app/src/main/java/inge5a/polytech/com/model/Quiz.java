package inge5a.polytech.com.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

import inge5a.polytech.com.model.question.Question;

/**
 * Created by Thomas on 11-Oct-17.
 */

public class Quiz implements Parcelable {
    private List<Team> teams;
    private List<Question> questions;

    private int timeLimit;

    protected Quiz(Parcel in) {
        //setQuestions(in.createTypedArrayList(Question.CREATOR));
        setTimeLimit(in.readInt());
    }

    public static final Creator<Quiz> CREATOR = new Creator<Quiz>() {
        @Override
        public Quiz createFromParcel(Parcel in) {
            return new Quiz(in);
        }

        @Override
        public Quiz[] newArray(int size) {
            return new Quiz[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(getQuestions());
        parcel.writeInt(getTimeLimit());
    }


    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }
}
