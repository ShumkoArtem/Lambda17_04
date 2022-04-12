import java.util.Objects;

public class People {

    private int age;
    private int growth;

    public People(int age, int growth) {
        this.growth = growth;
        this.age = age;
    }

    public int getGrowth() {
        return growth;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "People{" +
                "growth=" + growth +
                ", age=" + age +
                '}';
    }
}
