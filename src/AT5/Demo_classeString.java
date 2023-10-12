package AT5;

import javax.swing.*;
import java.util.Arrays;

public class Demo_classeString {
    public static void main(String[] args) {
        demo8();
    }

    public static void demo1() {
        String a = "ASD";

        if (a == "ASD") {
            System.out.print("TRUE");
        } else {
            System.out.println("FALSE");
        }

        if (a.equals("ASD")) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        if (a.contains("A")) {
            System.out.println(a.indexOf("A"));
        }

        System.out.println(a.indexOf("WF"));

        String b = "HEILLE LE BIG!";

        System.out.println(b.indexOf("I"));
        System.out.println(b.lastIndexOf("I"));

        System.out.println(a);
        System.out.println(a.concat("FDSA"));

        System.out.println(a.length());

        System.out.println(a.toCharArray());


    }

    public static void demo2() {
        String nomComplet = "Donald Duck";
        String prenom, nom;
        int indiceEspace;

        indiceEspace = nomComplet.indexOf(" ");
        prenom = nomComplet.substring(0, indiceEspace);
        nom = nomComplet.substring(indiceEspace + 1);

        System.out.println(nom + ", " + prenom);
    }

    public static void demo3() {
        String nomComplet = "Donald Duck";

        nomComplet = nomComplet.replace("Duck", "Dog");

        System.out.println(nomComplet);
    }

    public static void demo4() {
        String nomComplet = "Donald Duck";

        System.out.println(nomComplet.toLowerCase());
        System.out.println(nomComplet.toUpperCase());
    }

    public static void demo5() {
        String mot = "                          BONSOIR LE BIG                 ";
        mot = mot.trim();
        System.out.print(mot);
        System.out.print("!");
    }

    public static void demo6() {
        String mot = "BONSOIRE    EL BIG";

        while (mot.contains("  ")) {
            mot = mot.replace("  ", " ");
        }
        System.out.println(mot);
    }

    public static void demo7() {
        String phrase = "Voici une phrase, elle es magnifique.";
        String[] phrase2 = phrase.split(" ");
        System.out.println(Arrays.toString(phrase2));
    }

    public static void demo8() {
        String s1 = "allo";
        String s2 = "Bonsoire";

        System.out.println(s1.compareTo(s2));

        if (s1.compareTo(s2) < 0) {
            System.out.println(s1 + " " + s2);
        } else {
            System.out.println(s2 + " " + s1);
        }
    }

    public static void demo9() {
        int n0;
        Integer n1 = 1;
        Boolean b1;
        Double d1;


        n1.toString();
        n1.intValue();
        //...

        Integer.toString(n1);


    }

    public static void demo10() {
        String mdp = "P@tate5";
        boolean aMin = false,
                aMaj = false,
                aMChiffre = false,
                aSymbole = false;

        char[] lettres = mdp.toCharArray();
        for (char lettre : lettres) {
            if (Character.isUpperCase(lettre)) {
                aMaj = true;
            }
            else if (Character.isLowerCase(lettre)) {
                aMin = true;
            }
            else if (Character.isDigit(lettre) ) {
                aMChiffre = true;
            }
            else if (Character.isLetterOrDigit(lettre) && !Character.isWhitespace(lettre)) {
                aSymbole = true;
            }

            if (aMin && aMaj && aMChiffre && aSymbole && mdp.length() >= 8) {
                System.out.println("Ton mot de passe est correct le big");
            }
        }

    }
}
