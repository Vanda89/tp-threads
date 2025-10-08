package fr.diginamic;

import java.util.Random;

public final class Pig extends Animal {
    public Pig(Race race) {
        super("Cochon", "🐖", race);
    }

    @Override
    protected int step() {
        return new Random().nextInt(5) + 2;
    }

    @Override
    protected long sleepTime() {
        return new Random().nextInt(200) + 700;
    }
}
