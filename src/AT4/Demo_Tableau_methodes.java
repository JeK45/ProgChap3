package AT4;

import java.util.Arrays;

public class Demo_Tableau_methodes {
    public static void main(String[] args) {
        demo4();
    }

    public static void demo1() {
        int[] tab = {1,2,3,4,5,10};
        int c = demo1_Addition(tab);

        System.out.print(c);
    }

    public static int demo1_Addition(int[] nombres) {
        int somme = 0;

        for (int nb: nombres) {
            somme += nb;
            System.out.print(nb + ", ");
        }

        return somme;
    }


    public static void demo2() {
        int[] tableau = {2,23,4,5};
        demo2_doublerTableau(tableau);
        System.out.println(Arrays.toString(tableau));
    }
// Les tableaux sont donc envoyés par référence!
    public static void demo2_doublerTableau(int[] tableau/* pas les valeurs du tableau mais son adresse!*/) {
        for (int i = 0; i < tableau.length; i++)
            tableau[i] *= 2;
    }


    public static void demo3() {
        int[] tableau = {1,2,3,4,5};
        tableau = demo3_doublerTaille(tableau);

        System.out.println(Arrays.toString(tableau));
    }
    public static int[] demo3_doublerTaille(int[] tab) {
        int[] nouveauTableau = new int[tab.length * 2];

        for (int i = 0; i < tab.length; i++) {
            nouveauTableau[i] = tab[i];
        }
        return nouveauTableau;
    }

    public static void demo4() {
        int[] tableau = {1, -2, -3, 4, -22};
        demo4_valeurAbsolue(tableau);
        System.out.println(Arrays.toString(tableau));
    }
    public static void demo4_valeurAbsolue(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < 0) {
                tableau[i] *= -1;
            }
        }
    }
}
