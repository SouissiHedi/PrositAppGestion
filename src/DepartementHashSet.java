import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{
    static Set<Departement> tab = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        tab.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : tab) {
            if (departement.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        for (Departement dep : tab) {
            if (dep.equals(departement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {

    }

    @Override
    public void displayDepartement() {
        for (Departement dep : tab) {
            System.out.println(dep);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> TreeS = new TreeSet<>(new TreeComparator());
        TreeS.addAll(tab);
        return TreeS;
    }
}