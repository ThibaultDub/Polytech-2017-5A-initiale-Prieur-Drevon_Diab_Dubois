package inge5a.polytech.com.model;

/**
 * Created by Thomas on 11-Oct-17.
 */

public class Answer {

    private String text;
    private boolean isRightAnswer;

    public Answer(String text, boolean isRightAnswer) {
        this.text = text;
        this.isRightAnswer = isRightAnswer;
    }

    public String getText() {
        return text;
    }

    public boolean isRightAnswer() {
        return isRightAnswer;
    }
}
