package AT1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AT1 {
    public static void main(String[] args) {
        num8();
    }

    public static void num1() {
        int n;
        int p;

        n = 0;
        p = 0;
        while (n < 5) {
            n += 2;
        }
        p++;

        System.out.println("A : n = " + n + ", p = " + p);

        n = 0;
        p = 0;
        while (n < 5) {
            n += 2;
            p++;
        }
        System.out.println("B : n = " + n + ", p = " + p);

        /*
        A : n = 6, p = 1
        B : n = 6, p = 3
         */
    }

    public static void num2() {
        Scanner scan = new Scanner(System.in);
        int nb;

        System.out.print("Entrez un nombre: ");
        nb = scan.nextInt();

        for (int i = 1; i <= nb; i++) {
            System.out.println("Nombre: " + i + " - cube: " + Math.pow(i, 3));
        }
        scan.close();
    }

    public static void num3() {
        Scanner scan = new Scanner(System.in);
        int table;

        System.out.print("Table: ");
        table = scan.nextInt();

        for (int i = 0; i <= 12; i++) {
            System.out.println(table + " X " + i + " = " + (table * i));
        }
        scan.close();
    }

    public static void num4() {
        for (int i = 5; i <= 100; i += 5) {
            System.out.println(i);
        }
    }

    public static void num5() {
        for (int i = 100; i > 0; i -= 10) {
            System.out.println(i);
        }
    }

    public static void num6() {
        Scanner scan = new Scanner(System.in);
        int nb;

        do {
            System.out.print("Entrez un nombre positif: ");
            nb = scan.nextInt();
            if (nb > 0) {
                System.out.println("Sa racine carrée est : " + Math.sqrt(nb) + "\n");
            } else if (nb == 0) {
                System.out.println("Fin");
            } else {
                System.out.println("Entrez un nombre positif svp! \n");
            }
        } while (nb != 0);
        scan.close();
    }

    public static void num7() {
        Scanner scan = new Scanner(System.in);
        int nbLignes;
        String pyr = "";

        System.out.print("Combien de lignes? ");
        nbLignes = scan.nextInt();

        for (int i = 1; i <= nbLignes; i++) {
            pyr += "*";
            System.out.println(pyr);
        }
        scan.close();
    }

    public static void num8() {
        Scanner scan = new Scanner(System.in);
        int nb;
        int calcul;
        int count = 0;

        do {
            System.out.print("Entrez un nombre plus grand que 1: ");
            nb = scan.nextInt();
        } while (nb <= 1);

        calcul = nb;
        System.out.println(calcul);
        while (calcul != 1) {
            if (calcul % 2 == 0) {
                calcul /= 2;
                System.out.println(calcul);
                count++;
            } else {
                calcul *= 3;
                calcul++;
                System.out.println(calcul);
                count++;
            }
        }

        System.out.println("La suite débutant par " + nb + " a " + count + " éléments.");
        scan.close();
    }
}
