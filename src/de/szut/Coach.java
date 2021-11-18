package de.szut;

public class Coach extends Person {

    private int experience;

    public int getExperience() {
        return experience;
    }

    public Coach(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "\nCoach\n"
                + "name: " + this.name
                + "\nage: " + this.age
                + "\nexperience: " + this.experience;
    }


}