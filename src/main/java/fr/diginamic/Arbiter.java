package fr.diginamic;

public class Arbiter implements Runnable {
    private final Race race;
    private final int totalDistance = 50;

    public Arbiter(Race race) {
        this.race = race;
    }

    @Override
    public void run() {
        while (!race.isRaceOver()) {
            try {
                System.out.println("\nClassement intermédiaire :");
                race.getPositions().forEach((name, position) -> {
                    int progress = Math.min(position, totalDistance);
                    String line = "-".repeat(progress) + getEmoji(name);
                    System.out.printf("%-10s : %s%n", name, line);
                });

                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nLa course est terminée !");
        race.showRanking();
    }

    private String getEmoji(String name) {
        return switch (name) {
            case "Turtle" -> "🐢";
            case "Rabbit" -> "🐇";
            case "Duck" -> "🦆";
            case "Pig" -> "🐖";
            default -> "?";
        };
    }
}
