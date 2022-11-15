package de.fh_zwickau.oose.zuul01.service;

import de.fh_zwickau.oose.zuul01.model.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class ItemService {

    // TODO: 11/15/2022 implement file storage for objects
    private List<Item> itemsPerGame;

    public ItemService() {
        itemsPerGame = new ArrayList<>();
    }

    public <T extends Influencable> Item createMaterial(String name, String state, T influencable, String nextState, Room target, Room initial) {
        Map<Influencable, String> states = new HashMap<>();
        states.put(influencable, nextState);

        Material material = new Material();
        material.setName(name);
        material.setCurrentState(state);
        material.setAvailableStates(states);
        material.setTargetRoom(target);
        material.setInitialRoom(initial);

        itemsPerGame.add(material);
        return material;
    }

    public Werkzeug createWerkzeug(String name, Room target, Room initial) {
        Werkzeug werkzeug = new Werkzeug();

        werkzeug.setName(name);
        werkzeug.setInitialRoom(initial);
        werkzeug.setTargetRoom(target);

        itemsPerGame.add(werkzeug);
        return werkzeug;
    }

}
