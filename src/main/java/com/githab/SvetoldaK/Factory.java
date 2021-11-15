package com.githab.SvetoldaK;

public class Factory {
    public static void batman() {
        SuperHero batman = new SuperHero();
        batman.setName("Batman");
        batman.setForce(7);
        batman.setUniverse(false);
        batman.setSuperpower("Где детонатор?");
    }

    public void hulk() {
        SuperHero hulk = new SuperHero();
        hulk.setName("Hulk");
        hulk.setForce(8);
        hulk.setUniverse(true);
        hulk.setSuperpower("Халк, крушить!");
    }

    public void superman() {
        SuperHero superman = new SuperHero();
        superman.setName("Superman");
        superman.setForce(7);
        superman.setUniverse(false);
        superman.setSuperpower("Еще как боюсь. Просто принимаю отважный вид.");
    }

    public void aquaman() {
        SuperHero aquaman = new SuperHero();
        aquaman.setName("Aquaman");
        aquaman.setForce(6);
        aquaman.setUniverse(false);
        aquaman.setSuperpower("Надо напиться!");
    }

    public void spiderman() {
        SuperHero spiderman = new SuperHero();
        spiderman.setName("Spiderman");
        spiderman.setForce(9);
        spiderman.setUniverse(true);
        spiderman.setSuperpower("За Мэри Джейн!");
    }

    public void wolverine() {
        SuperHero wolverine = new SuperHero();
        wolverine.setName("Wolverine");
        wolverine.setForce(5);
        wolverine.setUniverse(true);
        wolverine.setSuperpower("Эй, мне будет очень больно! Это тебя радует?");
    }
}
