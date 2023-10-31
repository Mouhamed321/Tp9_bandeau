package TP9;

import bandeau.Bandeau;

abstract class Effet {
    protected Bandeau bandeau;

    public Effet(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public abstract void jouer();
}
