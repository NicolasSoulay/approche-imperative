package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        int nb = 0;
        while (nb>10 || nb<1) {
            System.out.println("Entrez un nombre compris entre 1 et 10");
            Scanner scanner = new Scanner(System.in) ;
            nb = scanner.nextInt() ;
        }
        System.out.println("voici la table de "+nb+" :");
        for(int i = 1; i <=10; i++) {
            System.out.println(nb+" * "+i+" = "+nb*i);
        }
    }
}
