package fr.boucles;

public class ExerciceTableauEntier {
    public static void main (String[] args) {
        Integer monTableau[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(monTableau[0]);
        System.out.println(monTableau.length);
        System.out.println(monTableau[monTableau.length - 1]);
        monTableau[4] = 8;
        System.out.println(monTableau[4]);
    }
}
