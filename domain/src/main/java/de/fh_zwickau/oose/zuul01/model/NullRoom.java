package de.fh_zwickau.oose.zuul01.model;

import de.fh_zwickau.oose.zuul01.AbstractRoom;

public class NullRoom extends AbstractRoom {
    /**
     * Konstruktor für NullRoom
     */
    public NullRoom(){
        super.setDescription("Hier gibt es keinen Ausgang.");
    }
}
