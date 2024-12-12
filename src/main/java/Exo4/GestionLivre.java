package Exo4;

public interface GestionLivre {
    void ajouterLivre(Livre livre);
    void supprimerLivre(int id);
    void afficherLivre();
    void emprunterLivre(int id);
    void rendreLivre(int id);
}
