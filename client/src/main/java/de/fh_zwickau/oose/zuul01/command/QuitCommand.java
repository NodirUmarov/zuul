package de.fh_zwickau.oose.zuul01.command;

import de.fh_zwickau.oose.zuul01.model.Player;

/**
 * Implementierung des Kommandos "ende"
 * 
 * @author Michael Kolling
 */
public class QuitCommand extends Command {
	/**
	 * Konstruktor.
	 */
	public QuitCommand() {
	}

	/**
	 * "ende" wurde eingegeben.
	 * 
	 * @return immer true (dadurch wird das Spiel beendet).
	 * 
	 */
	public boolean execute(Player player) {
		return true;
	}

	/**
	 * Gibt den Hilfetext für das QuitCommand zurück.
	 * @return Den Hilfetext für das QuitCommand.
	 */
	public String getHelp() {
		return "Mit diesem Kommando kannst du das Spiel beenden.";
	}

}
