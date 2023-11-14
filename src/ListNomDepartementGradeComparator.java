import java.util.Comparator;

public class ListNomDepartementGradeComparator implements Comparator<Employe> {

    @Override
    public int compare(Employe e1,Employe e2){
        String nd1 = e1.getNomDepartement().toUpperCase();
        String nd2 = e2.getNomDepartement().toUpperCase();

        // Returning in ascending order

        if(nd1.equals(nd2)) {
            return e1.getGrade() - e2.getGrade();
        }else{
            return nd1.compareTo(nd2);
        }
    }
}
