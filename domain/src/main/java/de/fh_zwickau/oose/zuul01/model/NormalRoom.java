package de.fh_zwickau.oose.zuul01.model;

import lombok.Data;

import java.util.HashMap;

@Data
public class NormalRoom extends Room {
    private HashMap<String, Item> schrank;
}
