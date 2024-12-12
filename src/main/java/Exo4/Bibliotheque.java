package Exo4;

import Exo3.Employees;

import java.util.ArrayList;

public class Bibliotheque implements GestionLivre {
    ArrayList<Livre> arrayList = new ArrayList<Livre>();

    @Override
    public void ajouterLivre(Livre livre) {
        arrayList.add(livre);
    }

    @Override
    public void supprimerLivre(int id) {
        Livre livreASupprimer = null;
        for (Livre livre : arrayList) {
            if (livre.getId() == id) {
                livreASupprimer = livre;
                break;
            }
        }
        if (livreASupprimer != null) {
            arrayList.remove(livreASupprimer);
        } else {
            throw new IllegalArgumentException("Erreur : Aucun livre trouvé avec cet id !");
        }
    }

    @Override
    public void afficherLivre() {
        if (arrayList.isEmpty()) {
            System.out.println("Aucun livre disponible dans la bibliothèque.");
            return;
        }
        System.out.println("Liste des livres disponibles :");
        for (Livre livre : arrayList) {
            System.out.println(livre);
        }
    }

    @Override
    public void emprunterLivre(int id) {
        Livre livreAEmprunter = null;
        for (Livre livre : arrayList) {
            if (livre.getId() == id) {
                livreAEmprunter = livre;
                break;
            }
        }
        livreAEmprunter.getEmprunter();
    }

    @Override
    public void rendreLivre(int id) {
        Livre livreAEmprunter = null;
        for (Livre livre : arrayList) {
            if (livre.getId() == id) {
                livreAEmprunter = livre;
                break;
            }
        }
        livreAEmprunter.rendreEmprunter();
    }
}
