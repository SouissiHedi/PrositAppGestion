import java.util.Comparator;

public class TreeComparator implements Comparator<Departement>{
    @Override
    public int compare(Departement e1,Departement e2){
        return e1.getId() - e2.getId();
    }
}
