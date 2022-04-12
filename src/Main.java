import java.util.*;

public class Main {
    public static List<People> people = new LinkedList<>();
    public static Map<String, Integer> marks = new HashMap<>();
    public static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("**********TASK 1************");
        /**
         * ЗАДАНИЕ 1. Написать класс People c полями рост, вес человека. Написать
         * компаратор для сравнения объектов класса People, который сравнивает
         * людей по индексу массы тела. Человек у которого больше индекс массы
         * тела считается больше. Создайте коллекцию People и отсортируйте ее.
         * * реализуйте компаратор используя лямбда выражение
         */
        People Artem = new People(34, 170);
        People Tatsiana = new People(33, 165);
        People Lesha = new People(3, 93);
        People Natasha = new People(8, 127);

        people.add(Artem);
        people.add(Tatsiana);
        people.add(Lesha);
        people.add(Natasha);

        System.out.println(people.toString());

        //сортировка с помощью отдельно переопределенного метода Compare в классе MyComparator
        //по возростанию
        Collections.sort(people, new MyComparator());
        System.out.println(people.toString());

        // Ананимный класс, сортировка по убыванию
        Collections.sort(people, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {

                return -(o1.getGrowth() - o2.getGrowth());
            }
        });
        System.out.println(people.toString());

        //Лямбда выражение, сортировка по возростанию
        Collections.sort(people, (People p1, People p2) -> p1.getAge() == p2.getAge() ? 0 :
                p1.getAge() > p2.getAge() ? 1 : -1);
        System.out.println(people.toString());

        System.out.println("**********TASK 2************");

        /**
         * ЗАДАНИЕ 2. Написать класс Student c полями:
         * String fio;
         * Map<String, Integer> marks (ключ - предмет, значение - оценка).
         * Написать компаратор для сравнения объектов класса Student, который
         * сравнивает студентов по среднему баллу. У кого выше средний балл, тот
         * студент считается больше.
         */

        /* Создаем коллекцию Map для каждого студента,
        и создаем ArrayList <Student>
         */
        Map<String, Integer> certificate1 = new HashMap<>();
        certificate1 = marksPut(certificate1);
        Student s1 = new Student("Artem", certificate1);
        System.out.println(s1.toString());
        studentList.add(s1);

        Map<String, Integer> certificate2 = new HashMap<>();
        certificate2 = marksPut(certificate2);
        Student s2 = new Student("Tatsiana", marksPut(certificate2));
        System.out.println(s2.toString());
        studentList.add(s2);

        Map<String, Integer> certificate3 = new HashMap<>();
        certificate3 = marksPut(certificate3);
        Student s3 = new Student("Lesha", marksPut(certificate3));
        System.out.println(s3.toString());
        studentList.add(s3);

        Map<String, Integer> certificate4 = new HashMap<>();
        certificate4 = marksPut(certificate4);
        Student s4 = new Student("Natasha", marksPut(certificate4));
        System.out.println(s4.toString());
        studentList.add(s4);

        // сортируем студентов (Ананимный класс)
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int res = o1.getAvg() == o2.getAvg() ? 0 : (o1.getAvg() > o2.getAvg() ? 1 : -1);
                return res;
            }
        });

        //Сортировка с помощью отдельного класса StudentComparator
        Collections.sort(studentList, new StudentComparator());

        //Лямбда выражение, сортировка по возростанию
        Collections.sort(studentList, (Student st1, Student st2) -> st1.getAvg() == st2.getAvg() ? 0
                : st1.getAvg() > st2.getAvg() ? 1 : -1);


        for (Student s : studentList) {
            System.out.println("Student: " + s.getFio() + ", Average " + s.getAvg());
        }


    }

    // Метод для добавления студентов в МАР
    private static Map<String, Integer> marksPut(Map<String, Integer> certificate) {

        certificate.put("История", (int) (Math.random() * 10 + 1));
        certificate.put("Русский", (int) (Math.random() * 10 + 1));
        certificate.put("Белоруский", (int) (Math.random() * 10 + 1));
        certificate.put("Математика", (int) (Math.random() * 10 + 1));
        certificate.put("English", (int) (Math.random() * 10 + 1));
        certificate.put("Физ-ра", (int) (Math.random() * 10 + 1));
        return certificate;
    }
}
