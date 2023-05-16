package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Entrez un nombre");
        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt() ;

        System.out.println("Vous avez entré le nombre : "+nb+", voici le resultat de la suite arithmetique de ce nombre:");
        for (int i=0; i<=nb; i++) {
            a += i;
        }
        System.out.println(a);
    }
}
