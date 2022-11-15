package de.fh_zwickau.oose.zuul01.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public abstract class Item {
    private String name;
}