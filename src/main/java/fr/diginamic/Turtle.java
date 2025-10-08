package fr.diginamic;

import java.util.Random;

public final class Turtle extends Animal {
    public Turtle(Race race) {
        super("Tortue", "🐢", race);
    }

    @Override
    protected int step() {
        return new Random().nextInt(3) + 1;
    }

    @Override
    protected long sleepTime() {
        return new Random().nextInt(200) + 900;
    }
}
