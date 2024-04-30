import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Stream> streams;

        StudentGroup group1 = new StudentGroup("Экономика", 101);
        group1.addStudent(new Student("Иванов И.И.", 145));
        group1.addStudent(new Student("Сидоров С.С.", 463));

        StudentGroup group2 = new StudentGroup( "Менеджммент", 102);
        group2.addStudent(new Student("Кузьмина И.Н,", 364));
        group2.addStudent(new Student("Коломиец И.С.", 173));
        group2.addStudent(new Student("Силенко М.С.", 172));

        StudentGroup group3 = new StudentGroup( "Управление качеством", 103);
        group3.addStudent(new Student ("Тулинова А.С.", 182));
        group3.addStudent(new Student("Ревва С.Н.", 193));
        group3.addStudent(new Student("Кистанова И.А.", 177));
        group3.addStudent(new Student("Васильева Я.В.", 273));

        StudentGroup group4 = new StudentGroup("Финансы", 104);
        group4.addStudent(new Student("Васильева И.И.", 345));
        group4.addStudent(new Student("Сидорова С.С.", 963));

        StudentGroup group5 = new StudentGroup( "КСЕ", 105);
        group5.addStudent(new Student("Кузьмин И.Н,", 564));
        group5.addStudent(new Student("Коломиец П.С.", 273));
        group5.addStudent(new Student("Субботина М.С.", 872));

        Stream stream1 = new Stream(group1, group2, group3);
        Stream stream2 = new Stream(group4, group5);

        streams = new LinkedList<>();
        streams.add(stream1);
        streams.add(stream2);


        System.out.println("Первый поток отличается от второго на количество групп: " + (stream1.compareTo(stream2)));

        //System.out.println(group1.getStudent("Иванов").compareTo(group1.getStudent("Петров")));

        TreeSet<Student> set = new TreeSet<>(new StudentComparator());

        for (Student student : group1) {
            set.add(student);
        }

        System.out.println(set);

        Iterator<Student> iterator = group1.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getName().equals("Петров")){
                iterator.remove();
            };
        }

        System.out.println("Проверка после удаления: ");
        for (Student student : group1){
            System.out.println(student.getName());
        }
    }
}

