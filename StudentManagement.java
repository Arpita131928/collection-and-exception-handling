import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// Custom Exception Class
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        try {
            // ArrayList
            ArrayList<String> students = new ArrayList<>();
            students.add("Arpita");
            students.add("Rahul");
            students.add("Priya");

            // HashMap
            HashMap<Integer, String> studentMap = new HashMap<>();
            studentMap.put(101, "Arpita");
            studentMap.put(102, "Rahul");
            studentMap.put(103, "Priya");

            // HashSet
            HashSet<String> courses = new HashSet<>();
            courses.add("Java");
            courses.add("Python");
            courses.add("HTML");

            System.out.println("Student List:");
            for (String student : students) {
                System.out.println(student);
            }

            // Search for a student ID
            int searchId = 105;

            if (!studentMap.containsKey(searchId)) {
                throw new StudentNotFoundException(
                    "Student ID " + searchId + " not found!"
                );
            }

            System.out.println("Student Name: " + studentMap.get(searchId));

        } catch (StudentNotFoundException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());

        } finally {
            System.out.println("Program execution completed.");
        }
    }
}