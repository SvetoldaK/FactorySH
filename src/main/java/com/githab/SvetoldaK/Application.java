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
        String figner1 = fighter.nextLine();

        System.out.println("Введите имя второго бойца");
        Scanner fighter1 = new Scanner(System.in);
        String figner2 = fighter1.nextLine();

        if (figner1 == figner2) {
            System.out.println("Герой не может сражаться против себя");
        }

        SuperHero hero1;
        SuperHero hero2;

        switch (figner1) {
            case "batman":
                hero1 = Factory.batman();
                System.out.println("Первый герой " + figner1);
                break;
            case "superman":
                hero1 = Factory.superman();
                System.out.println("Первый герой " + figner1);
                break;
            case "spiderman":
                hero1 = Factory.spiderman();
                System.out.println("Первый герой " + figner1);
                break;
            case "hulk":
                hero1 = Factory.hulk();
                System.out.println("Первый герой " + figner1);
                break;
            case "aquaman":
                hero1 = Factory.aquaman();
                System.out.println("Первый герой " + figner1);
                break;
            case "wolverine":
                hero1 = Factory.wolverine();
                System.out.println("Первый герой " + figner1);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + figner1);
        }

        switch (figner2) {
            case "batman":
                hero2 = Factory.batman();
                System.out.println("Первый герой " + figner2);
                break;
            case "superman":
                hero2 = Factory.superman();
                System.out.println("Первый герой " + figner2);
                break;
            case "spiderman":
                hero2 = Factory.spiderman();
                System.out.println("Первый герой " + figner2);
                break;
            case "hulk":
                hero2 = Factory.hulk();
                System.out.println("Первый герой " + figner2);
                break;
            case "aquaman":
                hero2 = Factory.aquaman();
                System.out.println("Первый герой " + figner2);
                break;
            case "wolverine":
                hero2 = Factory.wolverine();
                System.out.println("Первый герой " + figner2);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + figner2);
        }
        battle(hero1, hero2);

    }

}
