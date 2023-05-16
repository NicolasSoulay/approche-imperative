package fr.algorithmie;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InteractifFibonnaci {
    public static void main(String[] args) {
        int nbRang = 1;
        int[] monTab = {0,1};
        System.out.println("Entrez le rang de la suite de Fibonnaci souhaité, entre 1 et 31:");
        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt() ;
        if (nb < 32 && nb > 1){
            switch (nb) {
                case 1:
                    nbRang = 0;
                    break;
                case 2:
                    nbRang = 1;
                    break;
                default:
                    for (int i=2; i<=nb; i++) {
                        nbRang = monTab[0] + monTab[1];
                        monTab[0] = monTab[1];
                        monTab[1] = nbRang;
                    }
                    break;
            }
            System.out.println("Le nombre de le suite au rang "+nb+" est: "+nbRang);
        } else {
            System.out.println("nombre incorrect");
        }

    }
}
