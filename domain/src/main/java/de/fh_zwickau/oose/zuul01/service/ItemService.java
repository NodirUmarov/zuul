package de.fh_zwickau.oose.zuul01.service;

import de.fh_zwickau.oose.zuul01.model.*;

import java.util.HashMap;
import java.util.Map;

public class ItemService {

    public <T extends Influencable> Item createMaterial(String name, String state, T influencable, String nextState, Room target, Room initial) {
        Map<Influencable, String> states = new HashMap<>();
        states.put(influencable, nextState);

        Material material = new Material();
        material.setName(name);
        material.setCurrentState(state);
        material.setMap(states);
        material.setTargetRoom(target);
        material.setInitialRoom(initial);

        return material;
    }

    public Werkzeug createWerkzeug(String name, Room target, Room initial) {
        Werkzeug werkzeug = new Werkzeug();

        werkzeug.setName(name);
        werkzeug.setInitialRoom(initial);
        werkzeug.setTargetRoom(target);
        return werkzeug;
    }

}
