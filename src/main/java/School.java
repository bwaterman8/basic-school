import java.util.List;

public class School {
    private String name;
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalIncome;
    private static int totalSpent;

    public School(String name, List<Teacher> teachers, List<Student> students) {
        this.name = name;
        this.teachers = teachers;
        this.students = students;
        this.totalIncome = 0;
        this.totalSpent = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalIncome() {
        return totalIncome;
    }

    public static void updateTotalIncome(int income) {
        totalIncome += income;
    }

    public int getTotalSpent() {
        return totalSpent;
    }

    public static void updateTotalSpent(int spending) {
        totalIncome -= spending;
    }
}
