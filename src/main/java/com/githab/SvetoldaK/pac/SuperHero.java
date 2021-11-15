package com.githab.SvetoldaK.pac;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class SuperHero {

    private String name;
    private int force;
    private boolean universe;
    private String superpower;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SuperHero)) return false;
        SuperHero hero = (SuperHero) o;
        return force == hero.force &&
                universe == hero.universe &&
                superpower == hero.superpower &&
                Objects.equals(name, hero.name);
    }

    public int hashCode() {
        return Objects.hash(name, force, universe, superpower);
    }

    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                ", force=" + force +
                ", universe=" + universe +
                ", superpower=" + superpower +
                '}';
    }

}
