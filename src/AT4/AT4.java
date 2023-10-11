package AT4;

import java.util.Arrays;

public class AT4 {
    public static void main(String[] args) {
        num8_call();
    }

    public static void num1_call() {
        double[] notes = {10, 50, 80, 30, 99, 75, 60};
        int nbReussites = num1(notes);
        System.out.println(nbReussites); // Affiche 0
    }
    public static int num1(double[] notes) {
        int somme = 0;
        for (double i: notes) {
            if (i >= 60) {
                somme++;
            }
        }
        return somme;
    }


    public static void num2_call() {
            int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            num2(tab, 52); // Affiche rien
    }
    public static void num2(int[] tab, int count) {
        for (int i = 0; i < count && i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }


    public static void num3_call() {
        double[] salaires = {};
        double moyenne = num3(salaires);
        System.out.println(moyenne); // Affiche 58100.0
    }
    public static double num3(double[] salaires) {
        double moyenne = 0;

        for (double i: salaires) {
            moyenne += i;
        }

        return(moyenne /= salaires.length);
    }


    public static void num4_call() {
        double[] salaires = {35000, 42500, 55000, 125_000, 33000, 0};
        double moyenne = num4(salaires);
        System.out.println(moyenne); // Affiche 0.0
    }
    public static double num4(double[] salaires) {
        int count = 0;
        double somme = 0;

        while (salaires[count] != 0) {
            somme += salaires[count];
            count++;
        }

        return(somme /= count);
    }


    public static void num5_call(){
        int[] tab = {22, 105, 1, -4, 33, 39};
        int maximum = num5(tab);
        System.out.println(maximum); // Affiche 105
    }
    public static int num5(int[] tab) {
        int max = 0;

        for (int i: tab) {
            if (max < i) {
                max = i;
            }
        }

        return max;
    }


    public static void num6_call() {
        int[] tab = {22, 105, 1, -4, 33, 39};
        int minimum = num6(tab);
        System.out.println(minimum); // Affiche -4
    }
    public static int num6(int[] tab) {
        int min = 0;

        for (int i: tab) {
            if (min > i) {
                min = i;
            }
        }

        return min;
    }


    public static void num7_call() {
        int[] tab = {1, 22, 0, -55, 4, -3, 9, -2};
        int negatif = num7(tab);
        System.out.println(negatif); // Affiche -1
    }
    public static int num7(int[] tab) {
        int nb = tab[0];
        int count = 0;

        while (nb >= 0) {
            if (count == tab.length - 1) {
                return 0;
            } else {
                count++;
                nb = tab[count];
            }
        }
        return nb;
    }


    public static void num8_call() {
        int[] tab = {1, -22, 0, 55, -4, 3, -9, -2};
        int[] tabPos = num8(tab);
        System.out.println(Arrays.toString(tab)); // Affiche [1, -22, 0, 55, -4, 3, -9, -2]
        System.out.println(Arrays.toString(tabPos)); // Affiche [1, 0, 55, 3]
    }

    private static int[] num8(int[] tab) {
        int[] tabPos = new int[4];
        int nbPos = 0;
        int count = 0;

        for (int i: tab) {
            if (i >= 0) {
                tabPos[count] = i;
                count++;
            }
        }
        return tabPos;
    }
}
