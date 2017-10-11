package inge5a.polytech.com.gameclasses;

import java.util.ArrayList;

/**
 * Created by Thomas on 11-Oct-17.
 */

public class Question {

    private String text;
    private ArrayList<Answer> answers;
    private int value;

    public Question(String text, ArrayList<Answer> answers) {
        this.text = text;
        this.answers = answers;
    }

    public String getText() {
        return text;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public int answer(Answer a){
        if (a.isRightAnswer()) {
            return this.value;
        } else {
            return 0;
        }
    }
}
