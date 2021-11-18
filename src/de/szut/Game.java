package de.szut;

public class Game {

    private Team homeTeam;
    private Team awayTeam;
    private int goalsHome;
    private int goalsAway;

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void increaseHomeGoals() {
        this.goalsHome++;
    }

    public void increaseAwayGoals() {
        this.goalsAway++;
    }

    @Override
    public String toString() {
        return this.homeTeam.getName() + " - " + this.awayTeam.getName();
    }

    public String getScore() {
        return this.goalsHome + " - " + this.goalsAway;
    }
}
