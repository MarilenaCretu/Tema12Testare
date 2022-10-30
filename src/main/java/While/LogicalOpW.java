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
        while (count <= x) {
            count++;
            result += count;
            media = (double) result / 2;
        }
        System.out.println(media);
    }


}
