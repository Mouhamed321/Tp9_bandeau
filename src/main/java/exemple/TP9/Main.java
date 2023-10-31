package TP9;

import bandeau.Bandeau;

public class Main {
    public static void main(String[] args) {
        Bandeau bandeau = new Bandeau();

        EffetApparition effetApparition = new EffetApparition(bandeau);
        EffetClignotement effetClignotement = new EffetClignotement(bandeau);
        EffetApparitionGauche effetApparitionGauche = new EffetApparitionGauche(bandeau);

        Scenario scenario = new Scenario(bandeau);

        scenario.ajouterEffet(effetApparition, 2);
        scenario.ajouterEffet(effetClignotement, 1);
        scenario.ajouterEffet(effetApparitionGauche, 2);

        bandeau.close();
    }
}
