package fr.algorithmie;

public class CalculMoyenne {
    public static void main (String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        float moyenne = 0F;

        for (int i = 0; i < array.length; i++ ) {
            moyenne += array[i];
        }
        System.out.println(moyenne / array.length);
    }
}
