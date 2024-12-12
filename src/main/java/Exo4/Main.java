package Exo4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Bibliotheque bibliotheque = new Bibliotheque();
        Boolean onContinu = true;

        while (onContinu) {
                System.out.println("Que voulez vous faire ? ");
                System.out.println("1. Ajouter un livre ? ");
                System.out.println("2. Supprimer un livre ? ");
                System.out.println("3. Afficher les livres ? ");
                System.out.println("4. Emprunter un livre ? ");
                System.out.println("5. Rendre un livre ? ");
                System.out.println("6. On arrete ? ");

                int number = scanner.nextInt();



            switch (number) {
                case 1:
                    int id = (int) Math.round(Math.random() * 100);
                    System.out.println("Titre du livre : ");
                    String titre = scanner.next();
                    System.out.println("Auteur du livre : ");
                    String auteur = scanner.next();
                    Boolean estEmprunte = false;

                    Livre livre = new Livre(id, titre, auteur, estEmprunte);
                    bibliotheque.ajouterLivre(livre);
                    System.out.println(livre);
                    break;

                case 2:
                    System.out.println("Entrez l'id du livre à supprimer : ");
                    int idSupprimer = scanner.nextInt();
                    try {
                        bibliotheque.supprimerLivre(idSupprimer);
                        System.out.println("Le livre est bien supprimé");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 3:
                    bibliotheque.afficherLivre();
                    break;

                case 4:
                    System.out.println("Entrez l'id du livre a emprunter");
                    int idEmprunter = scanner.nextInt();

                    try {
                        bibliotheque.emprunterLivre(idEmprunter);
                        System.out.println("Le livre est emprunter");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 5:
                    System.out.println("Entrez l'id du livre a rendre");
                    int idRendre = scanner.nextInt();

                    try {
                        bibliotheque.rendreLivre(idRendre);
                        System.out.println("Le livre est rendu");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 6:
                    System.out.println("On arrete le programme");
                    onContinu = false;
                    break;
            }
        }
    }
}
