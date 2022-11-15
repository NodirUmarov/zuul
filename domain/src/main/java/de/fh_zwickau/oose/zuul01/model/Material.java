package de.fh_zwickau.oose.zuul01.model;

import lombok.Data;

import java.util.Map;

@Data
public class Material extends PlaceableItem {

    private String currentState;
    private Map<Influencable, String> map;

}
