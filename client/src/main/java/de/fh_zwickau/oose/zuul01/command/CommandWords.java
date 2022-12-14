package de.fh_zwickau.oose.zuul01.command;

import de.fh_zwickau.oose.zuul01.service.PlayerService;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Diese Klasse enthält alle im Spiel bekannten Kommandowörter. Sie wird
 * genutzt, um eingegebene Kommandos zu erkennen.
 *
 * @author Michael Kolling and David J. Barnes
 */

public class CommandWords {

	private HashMap<String, Command> commands;

	/**
	 * Konstruktor - Kommandowörter initialisieren
	 */
	public CommandWords(PlayerService playerService) {
		commands = new HashMap<String, Command>();
		commands.put("gehe", new GoCommand(playerService));
		commands.put("hilfe", new HelpCommand(this));
		commands.put("ende", new QuitCommand());
		commands.put("zurück", new BackCommand(playerService));
	}

	/**
	 * Liefere für ein gegebenes Kommandowort das dazugehörige Command-Objekt
	 * Rückgabe ist <null>, wenn ein nicht existierendes Kommandowort eingegeben
	 * wurde.
	 */
	public Command get(String word) {
		// Wenn word kein gültiges Kommandowort ist, wird in der HashMap commands nichts
		// gefunden.
		// In diesem Falle liefere ein NullCommand-Objekt zurück.
		if (commands.get(word) == null) {
			return new NullCommand();
		}
		// Andernfalls liefere das passende Command-Objekt zurück.
		else {
			return commands.get(word);
		}
	}

	/**
	 * Gib eine Liste aller existierenden Kommandos auf System.out aus.
	 */
	public void showAll() {
		for (Iterator i = commands.keySet().iterator(); i.hasNext();) {
			System.out.print(i.next() + "  ");
		}
		System.out.println();
	}
}
