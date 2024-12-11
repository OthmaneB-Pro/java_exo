package Exo1;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[5];
        int newResult = 0;


        for (int i=0; i<5; i++){
            System.out.println("Saisissez la " +(i + 1) + "er/ eme valeur : ");
            int value = scanner.nextInt();
            if(value >= 0 && value <= 20){
                tab[i] = value;
            }
            else{
                System.out.println("Valeur invalide. Veuillez entrer une note entre 0 et 20.");
                i--;
            }
        }
        System.out.println("Voila le tableau : " + Arrays.toString(tab));

        for (int j : tab) {
            newResult += j;
        }
        double moyenne = (double) newResult/tab.length;

        System.out.println("Voici la moyenne des notes : "  + moyenne);
    }
}