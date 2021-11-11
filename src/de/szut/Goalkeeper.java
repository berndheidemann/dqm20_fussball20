package de.szut;

import java.util.Random;

public class Goalkeeper extends Player{
    private int reaction;

    public Goalkeeper(String name, int age, int strength, int powerAtGoalKick, int motivation, int numberOfGoals, int force, int reaction) {
        super(name, age, strength, 0, motivation, numberOfGoals, force);
        this.reaction = reaction;
    }

    @Override
    public String toString() {
        return "Goalkeeper"
                + "\nreaction:" + reaction
                + "\nname: " + this.name
                + "\nage: " + this.age
                + "\npowerAtGoalKick: " + this.powerAtGoalKick
                + "\nstrength: " + this.strength
                + "\nforce" + this.force
                + "\nnumberOfGoals: " + this.numberOfGoals
                + "\nmotivation: " + this.motivation;
    }


    // power --> 10 des Spielers
    // reaction --> 8
    // 8, 9, 10
    public boolean ballHold(int powerAtGoalKick) {
        Random rnd=new Random();
        int zufallszahl= rnd.nextInt(4)-2;  // -2  -1   0   1
        if(powerAtGoalKick<validate(reaction+zufallszahl)) {
            return true;
        } else {
            return false;
        }
    }
}
