package AT2;

import java.util.Scanner;
import java.util.InputMismatchException;
public class AT2 {
    public static void main(String[] args) {
        num4();
    }

    public static void num1() {
        Scanner scan = new Scanner(System.in);

        int nb1 = 0;
        int nb2 = 0;
        Boolean isInt = false;

        do {
            System.out.print("Entrez deux entiers : ");
            try {
                nb1 = scan.nextInt();
                nb2 = scan.nextInt();
                isInt = true;
            } catch (InputMismatchException e) {
                System.out.println("Erreur 1, Entrée non-valide");
                scan.nextLine();
                isInt = false;
            }
        } while (!isInt);

        if (nb1 < nb2) {
            for (int i = nb1; i <= nb2; i++) {
                System.out.print(i + " ");
            }
        }
        else if (nb1 > nb2) {
            for (int i = nb1; i >= nb2; i--) {
                System.out.print(i + " ");
            }
        }
        else {
            System.out.print(nb1);
        }
        scan.close();
    }

    public static void num2() {
        Scanner scan = new Scanner(System.in);

        char lt1 = 0, lt2 = 0;
        boolean isChar = false;

        do {

                System.out.print("Entrez deux caractères (A - Z) : ");
                lt1 = scan.next().charAt(0);
                lt2 = scan.next().charAt(0);
                if (lt1 <= 90 && lt1 >= 65 && lt2 <= 90 && lt2 >= 65) {
                    isChar = true;
                }
                else {
                    isChar = false;
                    System.out.println("Erreur, Entrée invalide.");
                }
        } while (!isChar);

        if (lt1 < lt2) {
            for (char i = lt1; i <= lt2; i++) {
                System.out.print(i + " ");
            }
        }
        else if (lt1 > lt2) {
            for (char i = lt1; i >= lt2; i--) {
                System.out.print(i + " ");
            }
        }
        else {
            System.out.print(lt1);
        }
        scan.close();
    }

    public static void num3() {
        Scanner scan = new Scanner(System.in);

        int nb = 0;
        boolean isInt = false;

        do {
            try {
                System.out.print("Entrez un entier positif : ");
                nb = scan.nextInt();

                if (nb < 0) {
                    System.out.println("Erreur, Entier non-positif.");
                    isInt = false;
                }
                else {
                    isInt = true;
                }
            } catch (InputMismatchException r) {
                System.out.println("Erreur, Entrée non-valide.");
                scan.nextLine();
            }
        } while (!isInt);

        scan.close();

        do {
            System.out.print(nb % 10);
            nb /= 10;
        } while (nb > 0);
    }

    public static void num4() {
        Scanner scan = new Scanner(System.in);

        int nb = 0;
        int somme = 0;
        boolean isInt = false;

        do {
            try {
                System.out.print("Entrez un entier positif : ");
                nb = scan.nextInt();

                if (nb < 0) {
                    System.out.println("Erreur, Entier non-positif.");
                    isInt = false;
                }
                else {
                    isInt = true;
                }
            } catch (InputMismatchException r) {
                System.out.println("Erreur, Entrée non-valide.");
                scan.nextLine();
            }
        } while (!isInt);

        scan.close();

        do {
            somme += nb % 10;
            nb /= 10;
        } while (nb > 0);

        System.out.println("Somme : " + somme);
    }
}
