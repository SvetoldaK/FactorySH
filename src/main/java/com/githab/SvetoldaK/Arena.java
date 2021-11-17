package com.githab.SvetoldaK;

import java.util.Random;

public class Arena {
    private static final Random RANDOM = new Random();

    public static void battle(SuperHero hero1, SuperHero hero2) {
        random(hero1, hero2);
    }

    public static void battleAir(SuperHero hero1, SuperHero hero2){
        

        random(hero1, hero2);
    }

    private static void random(SuperHero hero1, SuperHero hero2){
        int r1 = RANDOM.nextInt(10) + hero1.getForce();
        int r2 = RANDOM.nextInt(10) + hero2.getForce();
        if (r1 > r2){
            System.out.println("Победил первый герой");
        }
        else
            System.out.println("Победил второй герой");
    }
}
