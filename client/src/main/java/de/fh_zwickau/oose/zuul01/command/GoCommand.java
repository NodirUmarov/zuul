package de.fh_zwickau.oose.zuul01.command;

import de.fh_zwickau.oose.zuul01.model.Player;
import de.fh_zwickau.oose.zuul01.model.enums.Direction;
import de.fh_zwickau.oose.zuul01.service.PlayerService;

/**
 * Implementierung des Kommandos "gehe"
 *
 * @author Michael Kolling
 * @version 1.0 (December 2002)
 */
public class GoCommand extends Command {

    private PlayerService playerService;

    /**
     * Konstruktor.
     */
    public GoCommand(PlayerService playerService) {
        this.playerService = playerService;
    }

    /**
     * Versuche, in eine Richtung oder zurück zu laufen. Wenn es dort einen Ausgang gibt,
     * betritt den betreffenden Raum oder gehe zum vorhergehenden Raum zurück.
     * Andernfalls wird eine Fehlermeldung ausgegeben.
     *
     * @return immer false.
     */

    public boolean execute(Player player) {
        if (hasSecondWord()) {
            Direction direction = Direction.valueOf(getSecondWord().toUpperCase().trim());
            playerService.walk(player, direction);
        } else {
            // Wenn kein zweites Wort eingegeben wurde, haben wir keine Ahnung, wohin der
            // Spieler gehen will:
            System.out.println("WOHIN gehen?");
        }
        return false;
    }

    /**
     * Gibt den Hilfetext für das GoCommand zurück.
     *
     * @return Den Hilfetext für das GoCommand.
     */
    public String getHelp() {
        return "Mithilfe des gehe-Kommandos kannst du in den nächsten Raum gehen. \n"
                + "Verwende dafür die entsprechenden Richtungswörter.";
    }
}
