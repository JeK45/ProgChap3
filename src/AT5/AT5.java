package AT5;

import java.util.Scanner;

public class AT5 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        num9();
    }

    public static void num1() {
        System.out.print("Entrez une chaine : ");
        String message = scan.nextLine();
        System.out.println(message.toUpperCase());
    }

    public static void num2() {
        System.out.print("Entrez une chaine : ");
        String message = scan.nextLine();
        System.out.println(message.length());
    }

    public static void num3() {
        System.out.print("Entrez une chaine : ");
        String message = scan.nextLine();
        System.out.println("Première lettre : " + message.charAt(0));
        System.out.println("Dernière lettre : " + message.charAt(message.length() - 1));
    }

    public static void num4() {
        System.out.print("Première chaîne : ");
        String message1 = scan.nextLine();
        System.out.print("Deuxième chaîne : ");
        String message2 = scan.nextLine();

        if (message1.equals(message2)) {
            System.out.println("Les deux chaînes sont égales!");
        } else {
            System.out.println("Les deux chaînes ne sont pas égales.");
        }
    }

    public static void num5() {
        System.out.print("Première chaîne : ");
        String message1 = scan.nextLine();
        System.out.print("Deuxième chaîne : ");
        String message2 = scan.nextLine();

        System.out.println(message1.concat(message2));
    }

    public static void num6() {
        System.out.print("Entrez une chaine : ");
        String message = scan.nextLine();
        System.out.print("Lettre à modifier : ");
        char lettreM = scan.nextLine().charAt(0);
        System.out.print("Lettre de remplacement : ");
        char lettreR = scan.nextLine().charAt(0);

        System.out.println(message.replace(lettreM, lettreR));
    }

    public static void num7() {
        System.out.print("Entrez une chaîne : ");
        String message1 = scan.nextLine();
        System.out.print("Commence par ? : ");
        String debut = scan.nextLine();

        if (message1.startsWith(debut)) {
            System.out.println(message1 + " commence par " + debut);
        }
        else {
            System.out.println(message1 + " ne commence pas par " + debut);
        }
    }

    public static void num8() {
        System.out.print("Entrez une chaîne : ");
        String message1 = scan.nextLine();
        System.out.print("Finit par ? : ");
        String fin = scan.nextLine();

        if (message1.endsWith(fin)) {
            System.out.println(message1 + " finit par " + fin);
        }
        else {
            System.out.println(message1 + " ne finit pas par " + fin);
        }
    }

    public static void num9() {
        System.out.print("Entrez plusieurs mots : ");
        String message1 = scan.nextLine();
        String[] message1T = message1.split(" ");

        System.out.print("La sous-chaîne à trouver ");
        String debut = scan.nextLine();

        for (String item: message1T) {
            if (item.startsWith(debut)) {
                System.out.print(item + " ");
            }
        }
    }

    public static void num10() {

    }

}
