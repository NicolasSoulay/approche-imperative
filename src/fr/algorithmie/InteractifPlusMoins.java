package fr.algorithmie;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        int monRandom = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        int a=1;
        System.out.println("Essayez de trouver le nombre compris entre 1 et 100:");
        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt() ;
        while (nb != monRandom){
            if(nb > monRandom){
                System.out.println("Loupé, le nombre est plus petit que "+nb+" rentrez un nouveau nombre:");
            } else {
                System.out.println("Loupé, le nombre est plus grand que "+nb+" rentrez un nouveau nombre:" );
            }
            nb = scanner.nextInt() ;
            a++;
        }

        System.out.println("Bravo, le nombre etais bien "+monRandom+". Vous avez trouver la solution en "+a+" coups");
    }
}
