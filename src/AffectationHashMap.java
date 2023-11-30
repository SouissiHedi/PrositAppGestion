import java.util.*;
import java.util.Comparator;

public class AffectationHashMap {
    private Map<Employe,Departement> tab;
    public void AffectationHashMap(){
        tab = new HashMap<>();
    }


    public void ajouterEmployeDepartement(Employe e, Departement d){
        tab.put(e,d);
    }

    public void afficherEmployeDepartement(){
        for (Map.Entry<Employe,Departement> entry:tab.entrySet()) {
            System.out.println("L'employé : "+entry.getKey().getNom()+ " "+ entry.getKey().getPrenom()+" travaille dans le departement : "+entry.getValue().getNom());
        }
    }

    public void supprimerEmploye (Employe e){
        tab.remove(e);
    }

    public void supprimerEmployeEtDepartement (Employe e,Departement d){
        Departement val=tab.get(e);
        if(val.equals(d)){
            tab.remove(e);
        }
    }

    public void afficherEmployes(){
        for (Employe e:tab.keySet()){
            System.out.println(e);
        }
    }

    public void afficherDepartements(){
        for (Departement d:tab.values()){
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye (Employe e){
        return tab.containsKey(e);
    }

    public boolean rechercherDepartement (Departement d){
        return tab.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap(){
        Comparator<Employe> emcomp =new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getId()-o2.getId();
            }
        };
        Map<Employe,Departement> myTree = new TreeMap<>(emcomp);
        myTree.putAll(tab);
        //return myTree;
        return new TreeMap<Employe,Departement>(tab);
    }
}
