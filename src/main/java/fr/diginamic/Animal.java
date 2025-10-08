package fr.diginamic;

import java.util.Random;

public class Animal implements Runnable {
    private final String name;
    private final String emoji;
    private final int totalDistance = 50;
    private final Race race;
    private int position = 0;

    public Animal(String name, String emoji, Race race) {
        this.name = name;
        this.emoji = emoji;
        this.race = race;
    }

    @Override
    public void run() {
        Random rand = new Random();

        while (position < totalDistance) {
            int footStep;
            long sleepTime;

            switch (name) {
                case "Tortue" -> { footStep = rand.nextInt(3) + 1; sleepTime = 900; }
                case "Lapin"  -> { footStep = rand.nextInt(10) + 5; sleepTime = 500; }
                case "Canard" -> { footStep = rand.nextInt(6) + 3; sleepTime = 600; }
                case "Cochon" -> { footStep = rand.nextInt(5) + 2; sleepTime = 700; }
                default -> { footStep = rand.nextInt(5) + 1; sleepTime = 800; }
            }
            position += footStep;

            System.out.printf("%s : %s%s%n", name, "-".repeat(Math.min(position, totalDistance)), emoji);

            try {
                Thread.sleep(rand.nextInt(200) + sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        race.declareArrival(name);
    }
}
