package Exo3;

import java.util.ArrayList;

public class Entreprise implements GestionEntreprise{
    private ArrayList<Employees> arrayList = new ArrayList<Employees>();


    @Override
    public void ajouterEmploye(Employees employees) {
        arrayList.add(employees);
    }

    @Override
    public void supprimerEmploye(int id) {
        Employees employeASupprimer = null;
        for (Employees employe : arrayList) {
            if (employe.getId() == id) {
                employeASupprimer = employe;
                break;
            }
        }
        if (employeASupprimer != null) {
            arrayList.remove(employeASupprimer);
        } else {
            throw new IllegalArgumentException("Erreur : Aucun employé trouvé avec cet id !");
        }
    }

    @Override
    public void afficherEmployes() {
        System.out.println("Liste de tous les employées : " + arrayList);
    }

    @Override
    public Employees chercherEmployeParId(int id) {
        for (Employees employees : arrayList) {
            if (employees.getId() == id) {
                return employees;
            }
        }
        throw new IllegalArgumentException("Employé avec l'id " + id + " non trouvé !");
    }
}
