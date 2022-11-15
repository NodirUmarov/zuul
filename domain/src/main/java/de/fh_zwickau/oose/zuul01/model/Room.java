package de.fh_zwickau.oose.zuul01.model;

import de.fh_zwickau.oose.zuul01.AbstractRoom;
import de.fh_zwickau.oose.zuul01.model.enums.Direction;
import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class Room extends AbstractRoom {
    private String roomName;
    private Map<Direction, AbstractRoom> exits;
    private List<Item> items;
}