package Exo4;

public class Livre {
    private int id;
    private String titre;
    private String auteur;
    private Boolean estEmprunte;

    public Livre(int id, String titre, String auteur, Boolean estEmprunte) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.estEmprunte = estEmprunte;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", estEmprunte=" + estEmprunte +
                '}';
    }

    public int getId() {
        return this.id;
    }

    public boolean getEmprunter() {
        if (!estEmprunte) {
            this.estEmprunte = true;
            return this.estEmprunte;
        } else {
            System.out.println("Le livre " + titre + " de " + auteur + " est deja emprunté");
            return estEmprunte;
        }

    }

    public boolean rendreEmprunter() {
        if (estEmprunte) {
            this.estEmprunte = false;
            return this.estEmprunte;
        } else {
            System.out.println("Le livre " + titre + " de " + auteur + " n'est pas emprunté");
            return estEmprunte;
        }
    }
}
