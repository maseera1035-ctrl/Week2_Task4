package app;

import java.util.HashMap;

public class StudentLookup {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println("Student with Roll 102: " + students.get(102));
    }
}
