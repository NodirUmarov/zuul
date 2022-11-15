package de.fh_zwickau.oose.zuul01.model;

import lombok.*;

import java.util.HashMap;

@Getter
@Setter
@NoArgsConstructor
public class NormalRoom extends Room {
    private HashMap<String, Item> schrank;
}
