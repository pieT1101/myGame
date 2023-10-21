package sk.patrikpajtas.guessgame;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        enterNumber();
    }
    public static void enterNumber (){

        Scanner hrac1 = new Scanner(System.in);
        System.out.println("Zadaj meno HRÁČ 1");
        String name = hrac1.nextLine();

        System.out.println("Ahoj " + name);


        Scanner hrac2 = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Zadaj meno HRÁČ 2");
        String name2 = hrac2.nextLine();

        System.out.println("Ahoj " + name2);

        System.out.println(" ");
        System.out.println("Začína " + name);
        System.out.println("Prosím vložte číslo od 0 - 100");
        int number1 = hrac1.nextInt();
        System.out.println(" ");
        System.out.println("Začína " + name2);
        System.out.println("Prosím vložte číslo od 0 - 100");
        int number2 = hrac2.nextInt();
        hrac1.close();
        hrac2.close();


        int i = (int) (Math.random() * 100);
        System.out.println("Náhodne číslo je " + i);

        if (Math.abs(i - number1) <= Math.abs(i - number2)) {
            System.out.println("Hráč číslo 1 vyhrál");
        } else {
            System.out.println("Hráč číslo 2 vyhrál");
        }
        System.out.println("Gratulujem");
    }
}
