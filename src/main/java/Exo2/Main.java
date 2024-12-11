package Exo2;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le premier nombre : " );
        double a = scanner.nextDouble();

        System.out.println("Entrez le deuxième nombre : " );
        double b = scanner.nextDouble();

        Calculatrice calculatrice = new Calculatrice(a, b);

        System.out.println("Choisissez une opération (addition, soustraction, multiplication, division) : ");
        String myOperation = scanner.next();
        double result;

        if(Objects.equals(myOperation, "addition")){
            result = calculatrice.addition();
            System.out.println("Le résulat est : " + result);
        }
        else if(Objects.equals(myOperation, "soustraction")){
            result = calculatrice.soustraction();
            System.out.println("Le résulat est : " + result);
        }
        else if(Objects.equals(myOperation, "multiplication")){
            result = calculatrice.multiplication();
            System.out.println("Le résulat est : " + result);
        }
        else if(Objects.equals(myOperation, "division")){
            if (b == 0){
                System.out.println("Erreur : On ne peut diviser un nombre par 0");
                return;
            }
            result = calculatrice.division();
            System.out.println("Le résultat est : " + result);
        }
        else{
            System.out.println("Aucun mot ne correspond !");
        }
    }
}