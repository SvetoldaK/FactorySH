package com.githab.SvetoldaK;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public boolean isUniverse() {
        return universe;
    }

    public void setUniverse(boolean marvel) {
        this.universe = marvel;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

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
