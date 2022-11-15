package de.fh_zwickau.oose.zuul01;

import de.fh_zwickau.oose.zuul01.controller.GameController;
import de.fh_zwickau.oose.zuul01.service.GameService;

public class Main {
    public static void main(String[] args) {
        GameController controller = new GameController(new GameService());
        controller.play();
    }
}