import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SocieteArrayList implements IGestion<Employe>{
    static List<Employe> tab = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe e) {
        tab.add(e);
    }
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : tab) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        for (Employe employe : tab) {
            if (employe.equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Employe e) {
        for (Employe employe : tab) {
            if (employe.equals(e)) {
                tab.remove(e);
            }
        }
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : tab) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        tab.sort(new ListIdComparator());
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        tab.sort(new ListNomDepartementGradeComparator());
    }
}
