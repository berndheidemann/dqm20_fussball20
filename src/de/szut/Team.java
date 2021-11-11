package de.szut;

import java.util.ArrayList;

public class Team {
    private String name;
    private Goalkeeper goalkeeper;
    private Coach coach;
    private ArrayList<Player> squad;

    public Team(String name, Goalkeeper goalkeeper, Coach coach) {
        this.name = name;
        this.goalkeeper = goalkeeper;
        this.coach = coach;
        this.squad = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.squad.add(player);
    }

    public int getTotalMotivation() {
        // Motivation aller Spieler addiert
        // + Motivation des Trainers
        // davon der Durchschnitt

        int sum = 0;
        sum += goalkeeper.getMotivation();
        for (Player player : this.squad) {
            sum += player.getMotivation();
        }
        return sum / (this.squad.size() + 1);
    }

    public int getTotalForce() {
        int sum = 0;
        sum += goalkeeper.getForce();
        int count = 0;
        for (int i = 0; i < this.squad.size() && i < 10; i++) {
            Player player = this.squad.get(i);
            sum += player.getMotivation();
            count++;
        }
        return sum / (count + 1);
    }

}
