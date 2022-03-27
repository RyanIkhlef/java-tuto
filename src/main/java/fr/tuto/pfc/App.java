package fr.tuto.pfc;

import fr.tuto.pfc.game.PFC;

/**
 * Classe principale du programme.
 *
 */
public class App {

    /**
     * Créer un nouvel objet "Game" et lance le jeu.
     *
     * @param args Les arguments passé lorsqu'on lance l'application. (on en utilise pas pour le moment)
     */
    public static void main( String[] args ) {
        PFC pfc = new PFC();
        pfc.start();
    }
}
