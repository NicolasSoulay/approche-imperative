package fr.algorithmie;

public class Rotation {
    public static void main (String[] args) {
        int[] monTableau = {0,1,2,3};
        int[] monTableauRotaté = new int[monTableau.length];
        for (int i = 0; i < monTableau.length; i++ ) {
            if (i==0){
                monTableauRotaté[i] = monTableau[monTableau.length-1];
            } else {
                monTableauRotaté[i] = monTableau[i-1];
            }
            System.out.println(monTableauRotaté[i]);
        }
    }
}
