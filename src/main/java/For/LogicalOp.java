package For;

import java.util.Scanner;

public class LogicalOp {
    int firstnumber;
    int targetPlusNumber = 100;
    int targetMinusNumber = -100;
    int secondnumber;

    public void getFirstnumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        firstnumber = s.nextInt();
    }

    //Exercitiul 1 FOR
    public void printFromNumberToTarget1() {
        System.out.println("Exercitiul 1 \"FOR\":\n\tAfisarea numerelor de la numarul introdus \"" + firstnumber + "\" pana la 100 este: ");
        for (int i = firstnumber; i <= targetPlusNumber; i++) {
            System.out.println(i);
        }
    }

    //Exercitiul 2 FOR
    public void printFromNumberToTarget2() {
        System.out.println("Exercitiul 2 \"FOR\":\n\tAfisarea numerelor de la numarul introdus \"" + firstnumber + "\" pana la -100 este: ");
        for (int i = firstnumber; i >= targetMinusNumber; i--) {
            System.out.println(i);
        }
    }

    public int getAldoileanumar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti al doilea numar: ");
        int b = s.nextInt();
        return secondnumber = b;
    }

    //Exercitiul 3 FOR
    public void numereintre() {
        System.out.println("Exercitiul 3 \"FOR\":\n\tAfisarea numerelor pare de la primul numar introdus \"" + firstnumber + "\" pana la al doilea numar introdus \"" + secondnumber + "\": ");
        for (int i = firstnumber; i <= secondnumber; i++) {
            System.out.println(i);
        }
        for (int i = firstnumber; i >= secondnumber; i--) {
            System.out.println(i);
        }
    }

    //Exercitiul 4 FOR
    public void numereintremicmare() {
        System.out.println("Exercitiul 4 \"FOR\":\n\tAfisarea numerelor de la primul numar introdus \"" + firstnumber + "\" pana la al doilea numar introdus \"" + secondnumber + "\": ");
        for (int i = firstnumber; i <= secondnumber; i++) {
            System.out.println(i);
        }
        for (int j = secondnumber; j <= firstnumber; j++) {
            System.out.println(secondnumber++);
        }
    }

    //Exercitiul 5 FOR
    public void unupanala100par() {
        System.out.println("Exercitiul 5 \"FOR\":\n\tAfisarea numerelor pare de la 1 pana la 100: ");
        for (int i = 1; i <= targetPlusNumber; i++)
            if (i % 2 == 0)
                System.out.println(i);
    }

    //Exercitiul 6 FOR
    public void unupanala100impar() {
        System.out.println("Exercitiul 6 \"FOR\":\n\tAfisarea numerelor impare de la 1 pana la 100: ");
        for (int i = 1; i <= 100; i++)
            if (i % 2 != 0)
                System.out.println(i);
    }

    //Exercitiul 7 FOR
    public void adunarea() {
        int result = 0;
        for (int i = firstnumber; i <= 100; i++) {
            result += i;
        }
        System.out.println("Exercitiul 7 \"FOR\":\n\tSuma numerelor de la numarul introdus \"" + firstnumber + "\" pana la 100 este: " + result);
    }

    //Exercitiul 8 FOR
    public void averageFromNumberTo100() {
        int result = 0;
        double media = 0;
        for (int i = firstnumber; i <= targetPlusNumber; i++) {
            result += i;
            media = (double) result / 2;
        }
        System.out.println("Exercitiul 8 \"FOR\":\n\tMedia numerelor de la numarul introdus \"" + firstnumber + "\" pana la 100 este: " + media);
    }

    //Exercitiul 9 FOR
    public void asterisk() {
        System.out.println("Exercitiul 9 \"FOR\":");
        for (int row = 1; row <= 7; row++) {
            for (int col = 1; col <= 8 - row; col++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
