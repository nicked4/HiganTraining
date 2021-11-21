package model;

import java.util.Random;

public class Person {

    private int height;
    private int weight;
    private boolean gender;
    private static Random random = new Random();

    public Person(int height, int weight, boolean gender) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format(
            "Person: height = %d, weight = %d, gender = %s",
            height,
            weight,
            gender ? "man" : "woman"
        );
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public boolean getGender() {
        return gender;
    }

    public double calcBmi() {
        return weight / Math.pow(height / 100.0, 2);
    }

    public static Person randomGenerate() {
        return new Person(
            random.nextInt(50) + 140,
            random.nextInt(80) + 40,
            random.nextBoolean()
        );
    }
}
