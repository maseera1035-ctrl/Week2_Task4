package app;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    public static void main(String[] args) {

        Queue<String> printQueue = new LinkedList<>();
        printQueue.add("Doc1");
        printQueue.add("Doc2");
        printQueue.add("Doc3");

        while (!printQueue.isEmpty()) {
            System.out.println("Printing: " + printQueue.poll());
        }
    }
}
