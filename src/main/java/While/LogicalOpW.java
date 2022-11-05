package While;

import java.util.Scanner;

public class LogicalOpW {
    int firstnumber;
    int targetPlusNumber = 100;
    int targetMinusNumber = -100;
    int secondnumber;
    int i = 1;

    public void getFirstnumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        firstnumber = s.nextInt();
    }

    public int getAldoileanumar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti al doilea numar: ");
        int b = s.nextInt();
        return secondnumber = b;
    }

    //Exercitiul 1 WHILE
    public void unupanala100w() {
        int i = firstnumber;
        System.out.println("Exercitiul 1 \"WHILE\":\n\tAfisarea numerelor de la numarul introdus \"" + firstnumber + "\" pana la \"" + targetPlusNumber + "\":");
        do {
            System.out.println(i);
            i++;
        } while (i <= targetPlusNumber);
    }

    //Exercitiul 2 WHILE
    public void unupanalaminus100w() {
        int i = firstnumber;
        System.out.println("Exercitiul 2 \"WHILE\":\n\tAfisarea numerelor de la numarul introdus \"" + firstnumber + "\" pana la \"" + targetMinusNumber + "\":");
        do {
            System.out.println(i);
            i--;
        } while (i >= targetMinusNumber);
    }

    //Exercitiul 3 WHILE
    public void numereintrew() {
        int i = firstnumber;
        System.out.println("Exercitiul 3 \"WHILE\":\n\tAfisarea numerelor pare de la primul numar introdus \"" + firstnumber + "\" pana la al doilea numar introdus \"" + secondnumber + "\": ");
        do {
            System.out.println(i);
            i++;
        } while (i <= secondnumber);
        do {
            System.out.println(i);
            i--;
        } while (i >= secondnumber);
    }

    //Exercitiul 4 WHILE
    public void numereintremicmarew() {
        int i = firstnumber;
        System.out.println("Exercitiul 4 \"WHILE\":\n\tAfisarea numerelor de la primul numar introdus \"" + firstnumber + "\" pana la al doilea numar introdus \"" + secondnumber + "\": ");
        do {
            System.out.println(i);
            i++;
        } while (i <= secondnumber);
        do {
            System.out.println(secondnumber);
            i--;
        } while (i >= secondnumber);
    }

    //Exercitiul 5 WHILE
    public void unupanala100parw() {
        System.out.println("Exercitiul 5 \"WHILE\":\n\tAfisarea numerelor pare de la " + i + "\" pana la \"" + targetPlusNumber + "\":");
        while (i <= targetPlusNumber) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }

    //Exercitiul 6 WHILE
    public void unupanalaminus100imparw() {
        int i = 1;
        System.out.println("Exercitiul 6 \"WHILE\":\n\tAfisarea numerelor impare de la " + i + "\" pana la \"" + targetPlusNumber + "\":");
        while (i <= targetPlusNumber) {
            System.out.println(i);
            i = i + 2;
        }
    }

    //Exercitiul 7 WHILE
    public void countnumerew() {
        int x = 111;
        int z = 8899;
        int result = 0;
        int count = x;
        double media = 0;
        System.out.println("Exercitiul 7 \"WHILE\":\n\tAfisez media numerelor de la \"" + x + "\" pana la \"" + z + "\":");
        while (count <= z) {
            count++;
            result += count;
            media = (double) result / 2;
        }
        System.out.println(media/100);
    }

    //Exercitiul 8 WHILE
    public void divizibilsapte() {
        int x = firstnumber;
        int z = secondnumber;
        int result = 0;
        int count = x;
        double media = 0;
        int b;
        System.out.println("Exercitiul 8 \" WHILE\":\n\tMedia numerelor divizibile cu 7 pentru intervalul - primul numar introdus \"" + firstnumber + "\" pana la al doilea numar introdus \"" + secondnumber +"\" este: ");
        while (count <= z) {
                count++;
            b=count%10;
            if (count % 7 == 0)
                result += count;
            media = (double) result / 2;
        }
        System.out.println(media);
    }

    //Exercitiul 9 WHILE
    public long primeleFibonacci() {
        int n = 1, n1 = 1, n2;
        System.out.println("Exercitiul 9 \"WHILE\":\n\tPrimele 20 de numere din sirul lui Fibonacci:");
        System.out.print(n + " " + n1 + " ");
        for (int i = 0; i < 18; i++) {
            n2 = n1 + n;
            System.out.print(n2 + " ");
            n = n1;
            n1 = n2;
        }
        return n;
    }

}