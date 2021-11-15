import lombok.Getter;
import lombok.Setter;
import com.githab.SvetoldaK.Arena;

import java.util.Scanner;

@Setter
@Getter
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
        switch (hero1) {
            case "batman":
                System.out.println("Первый герой batman");
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
                System.out.println("Второй герой batman");
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


    }

}
