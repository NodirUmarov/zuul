package de.fh_zwickau.oose.zuul01.model;

public class Werkzeug extends PlaceableItem implements Influencable {

    @Override
    public void influence(Material material) {
        material.setCurrentState(material.getMap().get(this));
    }
}
