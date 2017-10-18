package inge5a.polytech.com.model.question;

import java.util.ArrayList;

import inge5a.polytech.com.model.Answer;
import inge5a.polytech.com.model.content.Content;

/**
 * Created by thibault on 10/11/17.
 */

public class QuestionSound extends Question {
    private Content question_text;
    public QuestionSound(Content content, ArrayList<Answer> answers) {
        super(content, answers);
    }
}
