package de.szut;

import java.util.ArrayList;

public class Team {
    private String name;
    private Goalkeeper goalkeeper;
    private Coach coach;

    public String getName() {
        return name;
    }

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

    public Coach getCoach() {
        return coach;
    }

    @Override
    public String toString() {
        String result = "***Mannschaft***\n";
        result += "Trainer:" + this.coach.name + "\n";
        result += "Torwart:" + this.goalkeeper.getName() + "\n";

        for (Player player : this.squad) {
            result += "Spieler:" + player.getName() + "\n";
        }
        return result;
    }

}
