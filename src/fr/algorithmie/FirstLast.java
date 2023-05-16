package fr.algorithmie;

public class FirstLast {
    public static void main (String[] args) {
        int[] monTableau = {};
        boolean monBool = false;
        if (monTableau.length >= 1) {
            if (monTableau[0] == monTableau[monTableau.length-1]){
                monBool = true;
            }
        }
        System.out.println(monBool);
    }
}
