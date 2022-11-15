package de.fh_zwickau.oose.zuul01.model;

import lombok.Data;

@Data
public abstract class PlaceableItem extends Item {
    private Room initialRoom;
    private Room targetRoom;
}
