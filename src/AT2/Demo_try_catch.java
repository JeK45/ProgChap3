package AT2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Demo_try_catch {
    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        Scanner scan = new Scanner(System.in);
        int nb = 1;
        boolean isInt = false;

        do {
            System.out.print("Entrez un entier positif: ");
            try {
                nb = scan.nextInt();
                isInt = true;
            } catch (InputMismatchException f) {
                System.out.println("Un entier bozo!\n");
                isInt = false;
                scan.nextLine();
            } catch (IllegalStateException e) {
                //inutile, juste un exemple.
            }

            if (isInt) {
                if (nb > 0) {
                    System.out.println("Sa racine carrée est : " + Math.sqrt(nb) + "\n");
                } else if (nb == 0) {
                    System.out.println("Fin");
                } else {
                    System.out.println("Entrez un nombre positif svp! \n");
                }
            }
        }while (nb != 0) ;
        scan.close();
    }
}
