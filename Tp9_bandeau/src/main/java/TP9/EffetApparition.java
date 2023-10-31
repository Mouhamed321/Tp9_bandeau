package TP9;

import bandeau.Bandeau;

public class EffetApparition extends Effet {
    public EffetApparition(Bandeau bandeau) {
        super(bandeau);
    }

    @Override
    public void jouer() {
        bandeau.setMessage("Bienvenue au TP9");
        bandeau.sleep(2000);
        bandeau.setMessage("");
    }

}
