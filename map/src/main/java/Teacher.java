import java.util.Iterator;
import java.util.Map;

public class Teacher {
    private Map<String, Integer> students;
    private String name;

    public Teacher(Map<String, Integer> students, String name) {
        this.students = students;
        this.name = name;
    }

    public void addStudent(Student stu) {
        students.put(stu.getName(),stu.getAge());
    }

    public void printAllStudents() {
        Iterator<Map.Entry<String, Integer>> iterator = students.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> student = iterator.next();
            System.out.println(student.getKey() + "," + student.getValue());
        }
    }

}
