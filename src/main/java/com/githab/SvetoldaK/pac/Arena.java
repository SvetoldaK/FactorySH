package com.githab.SvetoldaK.pac;

import java.util.Random;

public class Arena {

    public static void battle(SuperHero hero1, SuperHero hero2) {

        Random r = new Random();

        switch (r.nextInt(2)) {
            case 0:
                System.out.println("Победил " + hero1);
                break;
            case 1:
                System.out.println("Победил" + hero2);
                break;
        }

    }

}
