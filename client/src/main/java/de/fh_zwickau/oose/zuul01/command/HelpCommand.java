package de.fh_zwickau.oose.zuul01.command;

import de.fh_zwickau.oose.zuul01.model.Player;

/**
 * Implementatiierung des Kommandos "hilfe"
 * 
 * @author Michael Kolling
 */
public class HelpCommand extends Command {
	private CommandWords commandWords;

	/**
	 * Konstruktor
	 * 
	 * @param words eine Instanz der Klasse CommandWords.
	 */
	public HelpCommand(CommandWords words) {
		commandWords = words; // Dadurch weiß die HelpCommand-Klasse,
								// welche Kommandos es gibt.
	}

	/**
	 * Gib einen kurzen Hilfetext und alle gültigen Kommandoworte aus.
	 * 
	 * @return immer false.
	 */
	public boolean execute(Player player) {
		if (hasSecondWord()) {
			Command helpNeeded = commandWords.get(getSecondWord());
			System.out.println(helpNeeded.getHelp());
			return false;
		} else {
			System.out.println("Du bist alleine und verloren und lungerst");
			System.out.println("in der Hochschule rum.");
			System.out.println();
			System.out.println("Mögliche Kommandos sind:");
			commandWords.showAll();
			return false;
		}
	}

	/**
	 * Gibt den Hilfetext für das HelpCommand zurück.
	 * @return Den Hilfetext für das HelpCommand.
	 */
	public String getHelp() {
		return "Mit diesem Kommando werden mögliche Kommandos ausgegeben.";
	}
}
