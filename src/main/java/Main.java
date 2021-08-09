import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 5000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(vanderhorn);

        Student tom = new Student(1, "Tom", 9);
        Student lil = new Student(2, "Lil", 12);
        Student ron = new Student(3, "Ron", 4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tom);
        studentList.add(lil);
        studentList.add(ron);

        School CAHS = new School("CAHS", teacherList, studentList);
        System.out.println("CAHS has earned a total of $" + CAHS.getTotalIncome());
        System.out.println("Toms fees are " + tom.getFeesTotal());
        tom.payFees(5000);
        System.out.println("Toms fees are " + tom.getFeesTotal());
        System.out.println("Toms fees are " + tom.getFeesPaid());

    }
}
