package de.fh_zwickau.oose.zuul01.model;

import lombok.Data;

import java.util.Stack;

@Data
public class Player {
    private Room currentRoom;
    private Stack<Room> path;
}