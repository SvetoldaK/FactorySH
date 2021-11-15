package com.githab.SvetoldaK;


import com.githab.SvetoldaK.pac.Factory;

import static com.githab.SvetoldaK.pac.Arena.battle;

import com.githab.SvetoldaK.pac.SuperHero;


import java.util.Scanner;

/**
 * Имя бойца вводить на английском языке с маленькой буквы.
 */

public class Application {
    public static void main(String[] args) {

        System.out.println("Введите имя первого бойца");
        Scanner fighter = new Scanner(System.in);
        String hero1 = fighter.nextLine();

        System.out.println("Введите имя второго бойца");
        Scanner fighter1 = new Scanner(System.in);
        String hero2 = fighter1.nextLine();

        if (hero1 == hero2) {
            System.out.println("Герой не может сражаться против себя");
        }

        SuperHero hero_1;
        SuperHero hero_2;

        switch (hero1) {
            case "batman":
                hero_1 = Factory.batman();
                System.out.println("Первый герой " + hero1);
                break;
            case "superman":
                hero_1 = Factory.superman();
                System.out.println("Первый герой " + hero1);
                break;
            case "spiderman":
                hero_1 = Factory.spiderman();
                System.out.println("Первый герой " + hero1);
                break;
            case "hulk":
                hero_1 = Factory.hulk();
                System.out.println("Первый герой " + hero1);
                break;
            case "aquaman":
                hero_1 = Factory.aquaman();
                System.out.println("Первый герой " + hero1);
                break;
            case "wolverine":
                hero_1 = Factory.wolverine();
                System.out.println("Первый герой " + hero1);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + hero1);
        }

        switch (hero2) {
            case "batman":
                hero_2 = Factory.batman();
                System.out.println("Первый герой " + hero2);
                break;
            case "superman":
                hero_2 = Factory.superman();
                System.out.println("Первый герой " + hero2);
                break;
            case "spiderman":
                hero_2 = Factory.spiderman();
                System.out.println("Первый герой " + hero2);
                break;
            case "hulk":
                hero_2 = Factory.hulk();
                System.out.println("Первый герой " + hero2);
                break;
            case "aquaman":
                hero_2 = Factory.aquaman();
                System.out.println("Первый герой " + hero2);
                break;
            case "wolverine":
                hero_2 = Factory.wolverine();
                System.out.println("Первый герой " + hero2);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + hero2);
        }
        battle(hero_1, hero_2);

    }

}
