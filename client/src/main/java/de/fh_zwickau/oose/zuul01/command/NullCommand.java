package de.fh_zwickau.oose.zuul01.command;

import de.fh_zwickau.oose.zuul01.model.Player;

/**
 * Ein Objekt der Klasse NullCommand wird erzeugt, wenn ein ungültiges Kommando
 * eingegeben wurde. Das NullCommand tut bei seiner Ausführung nichts weiter,
 * als eine Fehlermeldung auszugeben.
 * 
 * @author Michael Kolling
 */
public class NullCommand extends Command {

	/**
	 * Konstruktor.
	 */
	public NullCommand() {

	}

	/**
	 * Gibt eine Fehlermeldung aus.
	 * 
	 * @return immer false.
	 */
	public boolean execute(Player player) {
		System.out.println(
				"Ich verstehe nicht, was Du meinst... Gib \"hilfe\" ein, um eine Liste der gültigen Kommandos zu sehen.");
		return false;
	}

	/**
	 * Gibt den Hilfetext für das NullCommand zurück.
	 * @return Den Hilfetext für das NullCommand.
	 */
	public String getHelp() {
		return "Ich verstehe nicht, was Du meinst... Gib \\\"hilfe\\\" ein, um eine Liste der gültigen Kommandos zu sehen.";
	}
}
