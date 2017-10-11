package inge5a.polytech.com.gameclasses;

/**
 * Created by Thomas on 11-Oct-17.
 */

public class Answer {

    private String text;
    private boolean rightAnswer;

    public Answer(String text, boolean rightAnswer) {
        this.text = text;
        this.rightAnswer = rightAnswer;
    }

    public String getText() {
        return text;
    }

    public boolean isRightAnswer() {
        return rightAnswer;
    }
}
