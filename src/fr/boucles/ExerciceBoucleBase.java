package fr.boucles;

public class ExerciceBoucleBase {
    public static void main (String[] args) {
        for (int i=1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i=0; i < 20; i++) {
            System.out.println("Nicolas Soulay");
        }

        for (int i=0; i < 201; i++) {
            if (i%2 == 0){
                System.out.println(i);
            }
        }

        for (int i=0; i < 201; i++) {
            if (i%2 != 0){
                System.out.println(i);
            }
        }

    }
}
