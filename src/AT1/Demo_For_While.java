package AT1;

import java.util.Scanner;

public class Demo_For_While {
    public static void main(String[] args) {
        demo4();
    }
    public static void demo1() {
        int compteur = 0;

        while (compteur < 10) {
            System.out.println("Patates");
            compteur++;
        }

        System.out.println(compteur); //affichera 10
    }

    public static void demo2() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
    }

    public static void demo3() {
        int compteur = 0;

        do { //Execute le code avant de verifier. Permet d'exectuer d'un minimum d'une fois avant d'arreter.
            compteur++;
        } while (compteur < 10);
    }

    public static void demo4() {
        Scanner scan = new Scanner(System.in);
        int nb;

        do {
            System.out.print("Entrez un nombre entre 0 et 100: ");
            nb = scan.nextInt();
        } while (nb < 0 || nb > 100);


    }
}
