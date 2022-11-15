package de.fh_zwickau.oose.zuul01.model;

import de.fh_zwickau.oose.zuul01.model.enums.Direction;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Room {
    private String roomName;
    private String description;
    private Map<Direction, Room> exits;
    private List<Item> items;
}