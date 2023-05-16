package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        int[] mesNombres = new int[10];
        int a=0;
        System.out.println("Entrez 10 nombres");
        for (int i = 0; i<10 ; i++) {
            Scanner scanner = new Scanner(System.in) ;
            mesNombres[i] = scanner.nextInt() ;
        }
        int plusGrand = mesNombres[0];
        for (int i = 1; i< mesNombres.length-1; i++) {
            if (plusGrand<mesNombres[i]){
                plusGrand = mesNombres[i];
            }
        }
        System.out.println("le plus grand nombre est : "+plusGrand);
    }
}
