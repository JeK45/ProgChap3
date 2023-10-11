package AT3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo_Array {
    public static void main(String[] args) {
        demo9();
    }

    public static void demo1() {
            int[] tableau = new int[5];

            int[] tableau1 = {1, 2, 3, 4, 6};

            for (int i = 0; i < 5; i++) {
                System.out.println(tableau1[i]);
            }
    }

    public static void demo2() {
        int[] tab = new int[5];

        tab[0] = 5;
        tab[0]++;
        tab[1] = tab[0];
        tab[2] = tab[0] + tab[1];

        for (int i = 0; i < 5; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void demo3() {
        int[] tab1 = new int[5];
        tab1[0] = 1;
        tab1[1] = 2;
        tab1[2] = 3;
        tab1[3] = 4;
        tab1[4] = 5;

        int[] tab2 = {1, 2, 3, 4, 5};

        //tab1 est la meme chose que tab2

    }

    public static void demo4() {
        int[] tabInt = new int[5];
        char[] tabChar = new char[3];
        double[] tabDouble = new double[4];
        boolean[] tabBoolean = new boolean[2];
        String[] tabString = new String[4];
    }

    public static void demo5() {
        int nbElements;
        char[] tableau = {'a', 'b', 'c', 'd', 'e'};

        nbElements = tableau.length;

        System.out.println(tableau[tableau.length - 1]);
    }

    public static void demo6() {
        int[] tab1 = {1, 2 ,3 ,4, 6};

        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + ", ");
        }
    }

    public static void demo7() {
        int[] tableau = {1, 2, 3, 5 ,6 , 0, 31};
        int i = 0;

        while (tableau[i] != 0 && i < tableau.length) {
            i++;
        }

        System.out.print(i);
    }

    public static void demo8() {
        int[] tableau = {1, 2, 3, 5 ,6 , 0, 31};

        for (int elements: tableau) {
            System.out.println(elements);
        }
    }

    public static void demo9() {
        int[] tableau = {1, 2, 3, 5 ,6 , 0, 31};

        System.out.println(tableau); //son adresse dans la ram

        System.out.println(Arrays.toString(tableau)); //le tableau en lui meme
    }

    public static void demo10() {
        int[] tableau;

        tableau = new int[9];
    }
}
