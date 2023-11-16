public class Departement {
    private int id;
    private String nom;
    private int nbrEmployes;

    public Departement(){
    };

    public Departement(int id,String nom,int nbrEmployes) {
        this.id = id;
        this.nom = nom;
        this.nbrEmployes = nbrEmployes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrEmployes() {
        return nbrEmployes;
    }

    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Departement e) {
            return e.getNom().equals(nom) && e.getId()==id ;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Departement "+id+" : "+"\n"+
                "Nom : " + nom + "  ||  " +
                "Grade : " + nbrEmployes + "\n";
    }
}


