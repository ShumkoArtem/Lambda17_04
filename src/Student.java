import java.util.Comparator;
import java.util.Map;

public class Student{

    private String fio;
    private Map <String, Integer> marks;
    private double avg;

    public Student(String fio, Map<String, Integer> marks, double avg) {
        this.fio = fio;
        this.marks = marks;
        this.avg = avg;
    }

    public Student(String fio, Map<String, Integer> marks) {
        this.fio = fio;
        this.marks = marks;
    }

    public String getFio() {
        return fio;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Студент: " + getFio() + " - " + getMarks() + " Average: " + getAvg() ;
    }

    public double getAvg(){
        double sum = 0;
        for(Integer mark : this.marks.values()){
            sum += mark;
        }
        return sum / this.marks.size();
    }

}
