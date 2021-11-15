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

        // Просто определи чтобы не было ошибок
        SuperHero hero_1;
        SuperHero hero_2;

        switch (hero1) {
            case "batman":
                //Здесь мы создали объект бетман
                hero_1 = Factory.batman();
                // здесь просто выводим в консоль
                System.out.println(hero_1);
            case "superman":
                System.out.println("Первый герой superman");
            case "spiderman":
                System.out.println("Первый герой spiderman");
            case "hulk":
                System.out.println("Первый герой hulk");
            case "aquaman":
                System.out.println("Первый герой aquaman");
            case "wolverine":
                System.out.println("Первый герой wolverine");
        }

        switch (hero2) {
            case "batman":
                //Здесь мы создали объект бетман
                hero_2 = Factory.batman();
                // здесь просто выводим в консоль
                System.out.println(hero_2);
            case "superman":
                System.out.println("Второй герой superman");
            case "spiderman":
                System.out.println("Второй герой spiderman");
            case "hulk":
                System.out.println("Второй герой hulk");
            case "aquaman":
                System.out.println("Второй герой aquaman");
            case "wolverine":
                System.out.println("Второй герой wolverine");
        }

        // Отправляем 2 объекта на арену
        battle(hero_1, hero_2);
    }

}
