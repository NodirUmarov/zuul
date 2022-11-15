package de.fh_zwickau.oose.zuul01.controller;

import de.fh_zwickau.oose.zuul01.command.Command;
import de.fh_zwickau.oose.zuul01.command.Parser;
import de.fh_zwickau.oose.zuul01.model.Game;
import de.fh_zwickau.oose.zuul01.service.GameService;

public class GameController {

    private GameService gameService;
    private Parser parser;
    private Game game;

    public GameController(GameService gameService) {
        this.gameService = gameService;
        this.game = gameService.play();
        parser = new Parser(gameService);
    }

    /**
     * Die Hauptroutine des Spiels Läuft in einer Schleife, bis das Spiel beendet
     * wird.
     */
    public void play() {
        printWelcome();

        // Hier werden wiederholt Kommando-Eingaben gelesen und die
        // Kommandos ausgeführt, bis das Spiel beendet ist.

        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = command.execute(game.getPlayer());
        }
        System.out.println("Danke fürs Spielen! Schönen Tag noch!");
    }

    /**
     * Gibt die Willkommensnachricht für den Spieler aus.
     */
    private void printWelcome() {
        System.out.println();
        System.out.println("Willkommen in der Welt von Zuul!");
        System.out.println("Die Welt von Zuul ist ein neues, unglaublich langweiliges Adventure-Spiel.");
        System.out.println("Gib 'hilfe' ein, um Hilfe zu bekommen.");
        System.out.println();
        System.out.println(game.getPlayer().getCurrentRoom().getDescription());
    }
}
