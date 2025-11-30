package app;

import java.util.PriorityQueue;

public class PriorityTask {

    static class Task implements Comparable<Task> {
        String name;
        int priority;

        Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(Task t) {
            return Integer.compare(this.priority, t.priority);
        }

        @Override
        public String toString() {
            return name + " (Priority " + priority + ")";
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.add(new Task("Fix Bug", 1));
        tasks.add(new Task("Update Database", 2));
        tasks.add(new Task("Write Report", 3));

        System.out.println("Task Execution Order:");
        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }
    }
}
