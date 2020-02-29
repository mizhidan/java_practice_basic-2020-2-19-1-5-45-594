import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Application {

  public static void main(String[] args) {
    Student Linda = new Student("Linda", 18);
    Student Cindy = new Student("Cindy", 19);
    Student Mary = new Student("Mary", 19);
    Map<String, Integer> map = new LinkedHashMap<>();
    map.put(Linda.getName(),Linda.getAge());
    map.put(Cindy.getName(),Cindy.getAge());
    map.put(Mary.getName(),Mary.getAge());
    Teacher Bob = new Teacher(map, "Bob");
    Student Ben = new Student("Ben", 19);
    Student Solider = new Student("Solider", 20);
    Bob.addStudent(Ben);
    Bob.addStudent(Solider);
    Bob.printAllStudents();
  }

}
