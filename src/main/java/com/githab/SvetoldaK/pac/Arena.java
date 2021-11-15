package com.githab.SvetoldaK.pac;

import java.util.Random;

public class Arena {

    public static void battle(SuperHero hero_1, SuperHero hero_2) {

        Random r = new Random();

        switch (r.nextInt(2)) {
            case 0:
                System.out.println("Победил " + hero_1);
                break;
            case 1:
                System.out.println("Победил" + hero_2);
                break;
        }

    }

}
