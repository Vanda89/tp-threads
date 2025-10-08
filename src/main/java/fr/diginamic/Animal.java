package fr.diginamic;

import java.util.Random;

public abstract sealed class Animal implements Runnable permits Turtle, Rabbit, Pig, Duck {
    protected final String name;
    protected final String emoji;
    protected final int totalDistance = 50;
    protected final Race race;
    protected int position = 0;

    public Animal(String name, String emoji, Race race) {
        this.name = name;
        this.emoji = emoji;
        this.race = race;
    }


    protected abstract int step();
    protected abstract long sleepTime();

    @Override
    public void run() {
        Random rand = new Random();
        while (position < totalDistance) {
            position += step();
            System.out.printf("%s : %s%s%n", getClass().getSimpleName(), "-".repeat(Math.min(position, totalDistance)), emoji);
            try {
                Thread.sleep(rand.nextInt(200) + sleepTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        race.declareArrival(getClass().getSimpleName());
    }

}