package inge5a.polytech.com.model;

import java.util.ArrayList;

/**
 * Created by thibault on 10/11/17.
 */

public class QuestionSound extends Question {
    private Content question_text;
    public QuestionSound(Content content, ArrayList<Answer> answers) {
        super(content, answers);
    }
}
