package de.szut;

import java.util.Random;

public class Gameplay {
    private static final int PLAYING_TIME = 90;
    private static final int MAX_ADDITIONAL_TIME = 5;
    private static final int MAX_DURATION_UNTIL_NEXT_ACTION = 15;

    private Game game;

    public Gameplay(Game game) {
        this.game = game;
    }

    public int calculateForceOfTheTeam(Team team) {
        int totalForce = team.getTotalForce();
        int totalMotivation = team.getTotalMotivation();
        int coachExp = team.getCoach().getExperience();
        Random rnd = new Random();

        int rndNumber = rnd.nextInt(7) - 3;
        return totalForce * totalMotivation * coachExp + rndNumber;
    }

    private void doGameAction(Player player, Goalkeeper goalkeeper, int minute, Team team) {
        System.out.println("Minute: " + minute);
        System.out.println("Chance für " + team.getName());
        System.out.println(player.getName() + " zieht ab");
        if (goalkeeper.ballHold(player.getPowerAtGoalKick())) {
            System.out.println(goalkeeper.getName() + "  pariert glanzvoll.");
        } else {
            if (team == game.getAwayTeam()) {
                game.increaseAwayGoals();
            } else {
                game.increaseHomeGoals();
                System.out.println("TOR!!!  " + game.getScore() + " " + player.getName());
            }
        }
    }

}
