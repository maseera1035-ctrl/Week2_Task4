package app;

import java.util.TreeMap;

public class TimeTable {
    public static void main(String[] args) {

        TreeMap<Integer, String> timetable = new TreeMap<>();
        timetable.put(10, "Math");
        timetable.put(9, "Chemistry");
        timetable.put(12, "English");

        System.out.println("Timetable Sorted by Time: " + timetable);
    }
}
