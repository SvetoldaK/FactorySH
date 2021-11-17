package com.githab.SvetoldaK;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Data
public class SuperHero implements Flyable {

    private String name;
    private int force;
    private boolean universe;
    private String superpower;

    @Override
    public void fly() {
    }
}

