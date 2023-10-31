package TP9;

import bandeau.Bandeau;

public class EffetApparitionGauche extends Effet {
    public EffetApparitionGauche(Bandeau bandeau) {
        super(bandeau);
    }

    @Override
    public void jouer() {
        String texte = "Ainsi prend fin le TP9, à très bientôt pour la suite des activités.";
        for (int i = 0; i < texte.length(); i++) {
            bandeau.setMessage(texte.substring(0, i + 1));
            bandeau.sleep(100);
        }
        bandeau.setMessage("");
    }
}
