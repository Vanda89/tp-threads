package fr.diginamic;

import java.util.Random;

public final class Rabbit extends Animal {
    public Rabbit(Race race) {
        super("Lapin", "🐇", race);
    }

    @Override
    protected int step() {
        return new Random().nextInt(10) + 5;
    }

    @Override
    protected long sleepTime() {
        return new Random().nextInt(200) + 400;
    }
}
