package app;

import java.util.HashSet;

public class ExamSubmission {
    public static void main(String[] args) {

        HashSet<String> submissions = new HashSet<>();
        submissions.add("File1.pdf");
        submissions.add("File2.pdf");
        submissions.add("File1.pdf");  // duplicate removed

        System.out.println("Unique Submissions: " + submissions);
    }
}
