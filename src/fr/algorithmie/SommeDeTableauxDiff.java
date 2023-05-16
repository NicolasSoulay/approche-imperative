package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main (String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;

        int length = 0;
        int max = 0;

        if (array.length > array2.length) {
            length = array.length;
            max = array2.length;
        } else {
            length = array2.length;
            max = array.length;
        }
        int[] arraySomme = new int[length];


        for (int i = 0; i < length; i++ ) {
            if (i < max) {
                arraySomme[i] = array[i] + array2[i];
            } else {
                if (array.length == length){
                    arraySomme[i] = array[i];
                } else {
                    arraySomme[i] = array2[i];
                }
            }
            System.out.println(arraySomme[i]);
        }
    }
}
