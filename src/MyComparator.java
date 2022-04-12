import java.util.Comparator;

public class MyComparator implements Comparator <People>{

    @Override
    public int compare(People o1, People o2) {
        return o1.getGrowth() == o2.getGrowth() ? 0 : o1.getGrowth() > o2.getGrowth() ? 1 : -1;
    }
}
