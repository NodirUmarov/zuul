package de.fh_zwickau.oose.zuul01.service;

import de.fh_zwickau.oose.zuul01.AbstractRoom;
import de.fh_zwickau.oose.zuul01.model.*;
import de.fh_zwickau.oose.zuul01.model.enums.Direction;
import lombok.Getter;

import java.util.*;

import static de.fh_zwickau.oose.zuul01.model.enums.Direction.*;

@Getter
public class GameService {

    private PlayerService playerService;
    private ItemService itemService;
    private RoomService roomService;
    private Game game;

    public GameService() {
        itemService = new ItemService();
        playerService = new PlayerService();
        roomService = new RoomService();
    }

    public Game play() {
        Game game = new Game();

        Room vorhof = new Room();
        Room barlager = new Room();
        Room toiletten = new Room();
        Room pausenraum = new Room();
        Room lager = new Room();
        Room foyer = new Room();
        Room bar = new Room();
        Room buero = new Room();
        Room garderobe = new Room();
        Room partyraum = new Room();
        Room kueche = new Room();

        // Räume erzeugen:
        vorhof.setDescription("Außenbereich der Veranstaltungslocation.");
        barlager.setDescription("Lagerraum hinter der Bar. Hier finden sich Getränke und weiteres Zubehör für die Bar.");
        toiletten.setDescription("Hier sind die Toiletten.");
        pausenraum.setDescription("Hier können die Mitarbeiter sich ausruhen.");
        lager.setDescription("Das Hauptlager. Deko, Hygienezubehör etc.");
        foyer.setDescription("Du bist in Foyer. \nHier könntest du Snacks, Getränke etc. finden");
        bar.setDescription("Jetz bist du in der Bar. Getränke stehen für Sie zu verfügung.");
        buero.setDescription("Das ist die Büro. Es ist sehr bequem in Ruhe zu arbeiten.");
        garderobe.setDescription("Eine Garderobe.\nHier können Gäste ihre Jacken an einem der zahlreichen Aufhänger ganz bequem aufhängen.");
        partyraum.setDescription("Ein großer Saal, der für alle möglichen Anlässe geeignet ist.");
        kueche.setDescription("Hier ist die Hotelküche.\nHier können eine Menge Leute das leckere Essen für die Gäste zubereiten.");

        // Ausgänge aufbauen:
        vorhof.setExits(createExits(new Direction[]{NORDEN}, foyer));
        foyer.setExits(createExits(new Direction[]{OSTEN, SUEDEN, WESTEN, OBEN, UNTEN}, garderobe, vorhof, partyraum, partyraum, toiletten));
        bar.setExits(createExits(new Direction[]{WESTEN, NORDEN}, kueche, barlager));
        buero.setExits(createExits(new Direction[]{OSTEN}, pausenraum));
        barlager.setExits(createExits(new Direction[]{SUEDEN}, bar));
        toiletten.setExits(createExits(new Direction[]{OBEN}, foyer));
        pausenraum.setExits(createExits(new Direction[]{UNTEN, OSTEN, WESTEN}, foyer, lager, buero));
        lager.setExits(createExits(new Direction[]{WESTEN}, pausenraum));
        garderobe.setExits(createExits(new Direction[]{WESTEN}, foyer));
        partyraum.setExits(createExits(new Direction[]{WESTEN, OSTEN, NORDEN}, kueche, foyer, bar));
        kueche.setExits(createExits(new Direction[]{NORDEN, OSTEN,}, bar, partyraum));

        Werkzeug werkzeug = itemService.createWerkzeug("Knife", kueche, kueche);

        List<Item> items = new ArrayList<>();
        items.add(werkzeug);
        items.add(itemService.createMaterial("Orange", "Noye", werkzeug, "sliced", bar, kueche));
        kueche.setItems(items);

        Player player = new Player();
        player.setPath(new Stack<>());
        player.setCurrentRoom(foyer);

        game.setPlayer(player);
        game.setAvailableRooms(Arrays.asList(vorhof, barlager, toiletten, pausenraum, lager, foyer, bar, buero, garderobe, partyraum, kueche));

        this.game = game;
        return game;
    }

    private Map<Direction, AbstractRoom> createExits(Direction[] directions, Room... rooms) {
        Map<Direction, AbstractRoom> exists = new HashMap<>();
        for (int i = 0; i < directions.length; i++) {
            exists.put(directions[i], rooms[i]);
        }
        return exists;
    }

}
