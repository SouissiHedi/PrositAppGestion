import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Employe e = new Employe(8,"Souissi","Hedi","info",2);
        Employe e2 = new Employe(7,"Chamam","Youssef","info",3);
        Employe e3 = new Employe(8,"Souissi","Hedi","info",3);
        Employe e4 = new Employe(0,"Gam","Dhia","business",0);
        SocieteArrayList L= new SocieteArrayList();
        System.out.println(e);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println(e.equals(e3));
        L.ajouterEmploye(e);
        L.ajouterEmploye(e2);
        L.ajouterEmploye(e3);
        L.displayEmploye();
        System.out.println(L.rechercherEmploye("Chamam"));
        System.out.println(L.rechercherEmploye(e2));
        System.out.println(L.rechercherEmploye(e4));
        L.supprimerEmploye(e2);
        System.out.println(L.rechercherEmploye(e2));
        L.displayEmploye();
        L.ajouterEmploye(e2);
        L.ajouterEmploye(e4);
        L.trierEmployeParId();
        L.displayEmploye();
        L.trierEmployeParNomDépartementEtGrade();
        L.displayEmploye();


    }
}
