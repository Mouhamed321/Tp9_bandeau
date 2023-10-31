package TP9;

import bandeau.Bandeau;

public class EffetClignotement extends Effet {
    public EffetClignotement(Bandeau bandeau) {
        super(bandeau);
    }

    public void jouer() {
        for (int i = 0; i < 5; i++) {
            bandeau.setMessage("Attention, ça clignote.");
            bandeau.sleep(300);
            bandeau.setMessage("");
            bandeau.sleep(300);
        }
    }
}
