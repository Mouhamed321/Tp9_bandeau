package TP9;

import bandeau.Bandeau;

public class Scenario {
    private Bandeau bandeau;

    public Scenario(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public void ajouterEffet(Effet effet, int repetitions) {
        for (int i = 0; i < repetitions; i++) {
            effet.jouer();
        }
    }
}
