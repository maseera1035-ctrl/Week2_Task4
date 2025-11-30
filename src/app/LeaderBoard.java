package app;

import java.util.TreeSet;

public class LeaderBoard {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(300);
        scores.add(200);
        scores.add(400);
        scores.add(200); // duplicate removed

        System.out.println("Leaderboard (Sorted): " + scores);
    }
}
