package fr.algorithmie;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        int[] monTab = new int[0];
        while(true) {
            int nb = 0;
            Scanner scanner = new Scanner(System.in);
            if (nb != 1 || nb != 2) {
                System.out.println("Choisissez une option:");
                System.out.println("Option 1: Ajouter un nombre");
                System.out.println("Option 2: Afficher les nombres");
                System.out.println("Option 3: Eteindre le programme");

                nb = scanner.nextInt();
            }

            if (nb == 1) {
                int[] bufferTab = monTab;
                monTab = new int[monTab.length+1];
                for (int i=0; i< bufferTab.length; i++){
                    monTab[i] = bufferTab[i];
                }
                System.out.println("Entrez un nombre :");
                monTab[monTab.length-1] = scanner.nextInt();
            }

            if (nb == 2) {
                if (monTab.length > 0 ) {
                    System.out.println("Voici les nombres que vous avez entrés :");
                    for (int i = 0; i < monTab.length; i++) {
                        System.out.println(monTab[i]);
                    }
                } else {
                    System.out.println("Vous n'avez pas encore entré de nombre.");
                }
            }
            if (nb == 3) {
                break;
            }
        }
    }
}
