package fr.diginamic;

import java.util.Random;

public final class Duck extends Animal {
    public Duck(Race race) {
        super("Canard", "🪿", race);
    }

    @Override
    protected int step() {
        return new Random().nextInt(6) + 3;
    }

    @Override
    protected long sleepTime() {
        return new Random().nextInt(200) + 600;
    }
}
