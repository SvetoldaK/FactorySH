package com.githab.SvetoldaK;

public class Factory {

    public static SuperHero batman() {
        SuperHero batman = new SuperHero();
        batman.setName("Batman");
        batman.setForce(7);
        batman.setUniverse(false);
        batman.setSuperpower("Где детонатор?");
        batman.fly();
        return batman;
    }

    public static SuperHero hulk() {
        SuperHero hulk = new SuperHero();
        hulk.setName("Hulk");
        hulk.setForce(8);
        hulk.setUniverse(true);
        hulk.setSuperpower("Халк, крушить!");
        return hulk;
    }

    public static SuperHero superman() {
        SuperHero superman = new SuperHero();
        superman.setName("Superman");
        superman.setForce(7);
        superman.setUniverse(false);
        superman.setSuperpower("Еще как боюсь. Просто принимаю отважный вид.");
        superman.fly();
        return superman;
    }

    public static SuperHero aquaman() {
        SuperHero aquaman = new SuperHero();
        aquaman.setName("Aquaman");
        aquaman.setForce(6);
        aquaman.setUniverse(false);
        aquaman.setSuperpower("Надо напиться!");
        return aquaman;
    }

    public static SuperHero spiderman() {
        SuperHero spiderman = new SuperHero();
        spiderman.setName("Spiderman");
        spiderman.setForce(9);
        spiderman.setUniverse(true);
        spiderman.setSuperpower("За Мэри Джейн!");
        spiderman.fly();
        return spiderman;
    }

    public static SuperHero wolverine() {
        SuperHero wolverine = new SuperHero();
        wolverine.setName("Wolverine");
        wolverine.setForce(5);
        wolverine.setUniverse(true);
        wolverine.setSuperpower("Эй, мне будет очень больно! Это тебя радует?");
        return wolverine;
    }

}
