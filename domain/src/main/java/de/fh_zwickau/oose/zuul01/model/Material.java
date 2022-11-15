package de.fh_zwickau.oose.zuul01.model;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class Material extends PlaceableItem {

    private String currentState;
    private Map<Influencable, String> availableStates;

}
