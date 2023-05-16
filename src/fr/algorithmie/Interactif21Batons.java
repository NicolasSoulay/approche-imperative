package fr.algorithmie;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Interactif21Batons {
    public static void main(String[] args) {
        System.out.println("Jeux des 21 batons");
        System.out.println("Chaque joueurs choisissent le nombres de batons a retirer entre 1 et 3 à tour de role, le joueur qui retire le dernier baton a perdu");
        int nbBaton = 21;
        while (nbBaton > 0){
            int choixJoueur = 0;
            while ((choixJoueur < 1) || (choixJoueur > 3) ) {
                System.out.println("Choisissez le nombre de batons a retirer entre 1 et 3");
                Scanner scanner = new Scanner(System.in);
                choixJoueur = scanner.nextInt();
            }
            nbBaton -= choixJoueur;
            System.out.println("Vous retirez "+choixJoueur+" baton, il reste "+nbBaton);
            if (nbBaton == 1) {
                System.out.println("L'adversaire retire le dernier baton, vous avez gagné");
                break;
            } else if(nbBaton < 4) {
                System.out.println("L'adversaire retire "+(nbBaton-1)+" batons il reste 1 baton. Vous avez perdu");
                break;
            } else {
                int choixAdversaire = ThreadLocalRandom.current().nextInt(1, 4);
                nbBaton -= choixAdversaire;
                System.out.println("l'adversaire retire "+choixAdversaire+" baton, il reste "+nbBaton);
            }
            if (nbBaton <= 0){
                System.out.println("vous retirez le dernier baton, vous avez perdu");
            }
        }
    }
}
