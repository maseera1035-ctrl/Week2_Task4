package app;

import java.util.ArrayList;

public class Attendence {
    public static void main(String[] args) {

        ArrayList<String> attendance = new ArrayList<>();
        attendance.add("Alice");
        attendance.add("Bob");
        attendance.add("Charlie");
        attendance.add("Diana");

        System.out.println("Attendance List (Maintains Order): " + attendance);
    }
}
