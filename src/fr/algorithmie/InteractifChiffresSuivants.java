package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {

        System.out.println("Entrez un nombre");
        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt() ;

        System.out.println("Vous avez entré le nombre : "+nb+", voici les 10 nombres suivants:");
        for (int i=1; i<=10; i++) {
            System.out.println(nb+i);
        }
    }
}
