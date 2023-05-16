package fr.algorithmie;

public class FirstLast6 {
    public static void main (String[] args) {
        int[] monTableau = {1,2,3,4,5};
        boolean monBool = false;
        if (monTableau.length != 0) {
            if (monTableau[0] == 6|| monTableau[monTableau.length-1] == 6){
                monBool = true;
            }
        }
        System.out.println(monBool);
    }
}
