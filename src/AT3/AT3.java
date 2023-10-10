package AT3;

import java.util.Arrays;
import java.util.Scanner;

public class AT3 {
    public static void main(String[] args) {
        algo2();
    }

    public static void num1() {
        int[] tabInt = {-5, 40, -1000, 50, -3000, 3000, 5000, 0, -4, -7};
        int nb = tabInt[0];
        int i = 0;

        while (nb != 0){
            if (nb < 0) {
                System.out.println(nb);
            }
            i++;
            nb = tabInt[i];
        }

        /*
        -5
        -1000
        -3000
         */
    }

    public static void num2() {
        int[] tabSolde = {100, 6000, 5000, 2000, 1500, 4000, 10000, -100};
        int somme = 0;
        int i = 0;
        int solde = tabSolde[0];

        while (solde > 0) {
            if ((solde >= 1000) && (solde <= 5000)) {
                somme++;
            }
            i++;
            solde = tabSolde[i];
        }
        System.out.println(somme);

        /*
        4
         */
    }

    public static void num3() {
        char[] tabLettre = {'I','N','F','O','R','M','A','T','I','Q','U','E'};
        int i = 0;

        while (tabLettre[i] != 'Q') {
            i++;
        }

        System.out.println(i);

        /*
        9
         */
    }

    public static void num4() {
        char[] tabLettre = {'I','N','F','O','R','M','A','T','I','Q','U','E'};
        int somme = 0;

        for (int i = 1; i <= 5; i++) {
            if (tabLettre[i] == 'A') {
                somme++;
            }
        }
        System.out.println(somme);

        /*
        0
         */
    }

    public static void num5() {
        char[] tabSexe = {'M','F','M','F','M','M','A','F','M','A','A'};
        int[] tabAge = {15,18,17,20,38,14,10,69,84,16,27,0};
        int nbHommes = 0;
        int nbFemmes = 0;
        int nbAutres = 0;
        int nbMajeurs = 0;
        int nbLus = 0;
        int age = tabAge[nbLus];

        while (age != 0){
            if (age >= 18){
                if (tabSexe[nbLus] == 'M') {
                    nbHommes++; //2
                }
                else if (tabSexe[nbLus] == 'F') {
                    nbFemmes++; //3
                }
                else {
                    nbAutres++; //1
                }
                nbMajeurs++; //6
            }
            nbLus = nbLus + 1;
            age = tabAge[nbLus];
        }

        System.out.println(nbMajeurs + " " + nbHommes + " " + nbFemmes + " " + nbAutres);

        /*
        6 2 3 1
         */
    }

    public static void num6() {
        int[] tab1 = {33,2,5,34,25,4,8,13,-1};
        int[] tab2 = new int[9];
        int[] tab3 = new int[9];
        int ind2 = 0;
        int ind3 = 0;

        for (int ind1 = 0; ind1 <= 6; ind1++) {
            if (tab1[ind1] % 2 == 0){
                tab2[ind2] = tab1[ind1];
                ind2++;
            }
            else {
                tab3[ind3] = tab1[ind1];
                ind3++;
            }
        }

        /*
        tab1 = [33, 2, 5, 34, 25, 4, 8, 13, -1]
        tab2 = [0, 0, 0, 0, 0, 0, 0, 0, 0]
        tab3 = [0, 0, 0, 0, 0, 0, 0, 0, 0]
        ind2 = 0
        ind3 = 0

        ind1 = 0

        tab3 = [33, 0, 0, 0, 0, 0, 0, 0, 0]

        tab2 = [2, 0, 0, 0, 0, 0, 0, 0, 0]

        tab3 = [33, 5, 0, 0, 0, 0, 0, 0, 0]

        tab2 = [2, 34, 0, 0, 0, 0, 0, 0, 0]

        tab3 = [2, 34, 25, 0, 0, 0, 0, 0, 0]

        tab2 = [2, 34, 4, 0, 0, 0, 0, 0, 0]
         */
    }

    public static void algo1() {
        Scanner scan = new Scanner(System.in);

        int somme = 0;

        //System.out.print("combien d'entiers : ");
        //int nbEntiers = scan.nextInt();

        int[] tableau = new int[5];

        System.out.println("Entrez des entiers : ");
        for (int i = 0; i < 5; i++) {
            tableau[i] = scan.nextInt();
        }

        for (int elem: tableau) {
            somme += tableau[elem];
        }

        System.out.println(somme);
        scan.close();
    }

    public static void algo2() {

    }

    public static void algo3() {
        Scanner
    }
}
