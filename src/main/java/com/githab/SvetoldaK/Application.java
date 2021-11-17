package com.githab.SvetoldaK;


import static com.githab.SvetoldaK.Arena.battle;
import static com.githab.SvetoldaK.Arena.battleAir;


import java.util.Scanner;

/**
 * Имя бойца вводить на английском языке с маленькой буквы.
 */

public class Application {

    public static void main(String[] args) {
        System.out.println("Введите имя первого бойца");
        Scanner scanner = new Scanner(System.in);
        String fighter1 = scanner.nextLine();

        System.out.println("Введите имя второго бойца");
        String fighter2 = scanner.nextLine();

        if (fighter1.equals(fighter2)) {
            System.out.println("Герой не может сражаться против себя");
        }

        SuperHero hero1 = createSuperhero(fighter1);
        SuperHero hero2 = createSuperhero(fighter2);
        battle(hero1, hero2);
        battleAir(hero1, hero2);
    }

    private static SuperHero createSuperhero(String fighterName) {
        switch (fighterName) {
            case "batman":
                System.out.println("Выбран герой " + fighterName);
                return Factory.batman();
            case "superman":
                System.out.println("Выбран герой " + fighterName);
                return Factory.superman();
            case "spiderman":
                System.out.println("Выбран герой " + fighterName);
                return Factory.spiderman();
            case "hulk":
                System.out.println("Выбран герой " + fighterName);
                return Factory.hulk();
            case "aquaman":
                System.out.println("Выбран герой " + fighterName);
                return Factory.aquaman();
            case "wolverine":
                System.out.println("Выбран герой " + fighterName);
                return Factory.wolverine();
            default:
                throw new IllegalArgumentException("Unexpected value: " + fighterName);
        }
    }
}
