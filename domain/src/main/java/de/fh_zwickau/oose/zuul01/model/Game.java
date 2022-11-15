package de.fh_zwickau.oose.zuul01.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Game {
    private Player player;
    private List<Room> availableRooms;
}