package inge5a.polytech.com.model;

import java.util.ArrayList;

/**
 * Created by Thomas on 11-Oct-17.
 */

public abstract class Question {

    private Content question_content;
    private ArrayList<Answer> answers;
    private int difficulty;

    public Question(Content content, ArrayList<Answer> answers) {
        this.question_content = content;
        this.answers = answers;
    }

    public Content getContent() {
        return question_content;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public int getPointsEarned(Answer a){
        if (a.isRightAnswer()) {
            return this.difficulty;
        } else {
            return 0;
        }
    }
}
