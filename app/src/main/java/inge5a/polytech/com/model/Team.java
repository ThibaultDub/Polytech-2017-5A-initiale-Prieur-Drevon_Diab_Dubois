package inge5a.polytech.com.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 11-Oct-17.
 */

public class Team {

    private String name;
    private List<Player> players;
    private int lives;
    private int score;
    private int correctAnswerStreak;

    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
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
