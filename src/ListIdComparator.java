import java.util.Comparator;

public class ListIdComparator implements Comparator<Employe> {

    @Override
    public int compare(Employe e1,Employe e2){
        return e1.getId() - e2.getId();
    }
}
