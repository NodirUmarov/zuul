package de.fh_zwickau.oose.zuul01.command;

import de.fh_zwickau.oose.zuul01.model.Player;
import de.fh_zwickau.oose.zuul01.service.PlayerService;

/**
 * Implementatiierung des Kommandos "zurück"
 *
 * @author Ainazik Momunalieva
 */
public class BackCommand extends Command {

    private PlayerService playerService;

    public BackCommand(PlayerService playerService) {
        this.playerService = playerService;
    }

    /**
     *
     * Versuche, in vorherige Richtung bzw. zurück zu laufen. Wenn es dort einen Ausgang gibt,
     * betritt den betreffenden Raum. Andernfalls wird eine Fehlermeldung
     * ausgegeben.
     *
     * @return immer false.
     */
    @Override
    public boolean execute(Player player) {
        playerService.goBack(player);
        return false;
    }

    /**
     * Gibt den Hilfetext für das BackCommand zurück.
     * @return Den Hilfetext für das BackCommand.
     */
    @Override
    public String getHelp() {
        return "Mithilfe des zurück-Kommandos kannst du in den vorherigen Raum gehen. \n"
                + "Verwende dafür die entsprechenden Richtungswörter.";
    }
}
