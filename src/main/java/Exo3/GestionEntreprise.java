package Exo3;

public interface GestionEntreprise {
    void ajouterEmploye(Employees employees);
    void supprimerEmploye(int id);
    void afficherEmployes();
    Employees chercherEmployeParId(int id);

}
