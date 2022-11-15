package de.fh_zwickau.oose.zuul01.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Stack;

@Getter
@Setter
@NoArgsConstructor
public class Player {
    private Room currentRoom;
    private Stack<Room> path;
}