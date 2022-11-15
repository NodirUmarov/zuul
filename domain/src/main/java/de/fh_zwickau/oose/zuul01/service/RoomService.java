package de.fh_zwickau.oose.zuul01.service;

import de.fh_zwickau.oose.zuul01.AbstractRoom;
import de.fh_zwickau.oose.zuul01.model.Item;
import de.fh_zwickau.oose.zuul01.model.Room;
import de.fh_zwickau.oose.zuul01.model.enums.Direction;

import java.util.List;
import java.util.Map;

public class RoomService {


    public Room createRooms(String roomName, String description, Map<Direction, AbstractRoom> exits, List<Item> items) {
        Room room = new Room();
        room.setRoomName(roomName);
        room.setDescription(description);
        room.setExits(exits);
        room.setItems(items);
        return room;
    }
}
