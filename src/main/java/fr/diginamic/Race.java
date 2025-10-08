package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private final List<String> ranking = new ArrayList<>();
    private boolean raceOver = false;
    private final int nbOfParticipants;

    public Race(int nbOfParticipants) {
        this.nbOfParticipants = nbOfParticipants;
    }

    public synchronized boolean isRaceOver() {
        return raceOver;
    }


    public synchronized void declareArrival(String animalName) {
        if(!ranking.contains(animalName)){
            ranking.add(animalName);


            if (ranking.size() == 1) {
                System.out.println(animalName + " gagne !");
            }

            if (ranking.size() == nbOfParticipants) {
                raceOver = true;
                showRanking();
            }
        }
    }

    private void showRanking() {
        System.out.println("\nClassement final :");
        for (int i = 0; i < ranking.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, ranking.get(i));
        }
    }



}
