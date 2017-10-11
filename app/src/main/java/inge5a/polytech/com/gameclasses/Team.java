package inge5a.polytech.com.gameclasses;

import java.util.ArrayList;

/**
 * Created by Thomas on 11-Oct-17.
 */

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int lives;
    private int score;
    private int correctAnswerStreak;

    public Team(String name, ArrayList<Player> players) {
        this.name = name;
        this.players = players;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getScore() {
        return score;
    }

    public void addPoints(int points){
        this.score += points;
        if (points > 0){
            this.correctAnswerStreak++;
            if (this.correctAnswerStreak >= 10){
                this.correctAnswerStreak = 0;
                lives ++;
            }
        } else {
            this.correctAnswerStreak = 0;
            lives --;
        }
    }
}
