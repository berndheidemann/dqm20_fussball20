package de.szut;

import java.util.Random;

public class Player extends Person {

    protected int powerAtGoalKick;
    protected int motivation;
    protected int numberOfGoals;
    protected int force;

    public int getForce() {
        return force;
    }

    public int getMotivation() {
        return motivation;
    }

    public Player(String name, int age, int powerAtGoalKick, int motivation, int numberOfGoals, int force) {
        super(name, age);
        this.powerAtGoalKick = powerAtGoalKick;
        this.motivation = motivation;
        this.numberOfGoals = numberOfGoals;
        this.force = force;
    }

    public int shootAtGoal() {
        // -2, -1, 0, 1
        Random rnd = new Random();
        int zufallszahl=rnd.nextInt(4); // 0, 1, 2 oder 3
        zufallszahl=zufallszahl-2; // -2, -1, 0, oder 1
        return validate(powerAtGoalKick+zufallszahl);
    }

    public void addGoal() {
        numberOfGoals++;
    }

    public int validate(int number) {
        // 12 --> return 10
        // -1 --> return 1
        // 5 ---> return 5
        if( number>10) {
            return 10;
        }
        if (number<0) {
            return 1;
        }
        return number;
    }

    @Override public String toString() {
        return "\nPlayer\n"
                + "name: " + this.name
                + "\nage: " + this.age
                + "\npowerAtGoalKick: " + this.powerAtGoalKick
                + "\nforce" + this.force
                + "\nnumberOfGoals: " + this.numberOfGoals
                + "\nmotivation: " + this.motivation;
    }
}
