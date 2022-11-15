package de.fh_zwickau.oose.zuul01.service;

import de.fh_zwickau.oose.zuul01.AbstractRoom;
import de.fh_zwickau.oose.zuul01.model.NullRoom;
import de.fh_zwickau.oose.zuul01.model.Player;
import de.fh_zwickau.oose.zuul01.model.Room;
import de.fh_zwickau.oose.zuul01.model.enums.Direction;

import java.util.Stack;

public class PlayerService {

    public void walk(Player player, Direction direction) {
        // Try to leave current room.
        AbstractRoom nextRoom = player.getCurrentRoom().getExits().getOrDefault(direction, new NullRoom());
        Stack<Room> path = player.getPath();

        if (nextRoom.getClass() == NullRoom.class)
            System.out.println(nextRoom.getDescription());
        else {
            path.add(player.getCurrentRoom());
            player.setCurrentRoom((Room) nextRoom);
            System.out.println(nextRoom.getDescription());
        }
    }

    public void goBack(Player player) {
        Stack<Room> path = player.getPath();
        if(path.isEmpty()){
            System.out.println("Du kannst nicht zurück gehen. Du bist beim Start");
        }else {
            Room prev = path.pop();
            player.setCurrentRoom(prev);
            System.out.println(prev.getDescription());
        }
    }
}
