import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getAvg() == o2.getAvg() ? 0 : o1.getAvg() > o2.getAvg() ? 1 : -1);
    }
}