package Exo3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Employees> tab = new ArrayList<Employees>();
        Entreprise entreprise = new Entreprise();
        Scanner scanner = new Scanner(System.in);

        int id = (int) Math.round(Math.random()* 100);


        System.out.println("Veuillez saisir le nom : ");
        String name = scanner.next();

        System.out.println("Veuillez saisir le métier : ");
        String job = scanner.next();

        System.out.println("Veuillez saisir le salaire : ");
        double salary = scanner.nextDouble();


        Employees employees = new Employees(id, name, job, salary);

        System.out.println("Voici l'employé ajouté : ");
        entreprise.ajouterEmploye(employees);

        System.out.println("Voici la liste des employées : ");
        entreprise.afficherEmployes();

        System.out.println("Supprimez un employé : ");
        entreprise.supprimerEmploye(id);

        System.out.println("Voici l'employé que vous recherchez: ");
        entreprise.chercherEmployeParId(id);


    }
}
