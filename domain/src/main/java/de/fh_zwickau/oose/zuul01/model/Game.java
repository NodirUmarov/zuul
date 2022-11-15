package de.fh_zwickau.oose.zuul01.model;

import lombok.Data;

import java.util.List;

@Data
public class Game {
    private Player player;
    private List<Room> availableRooms;
}