package app;

import java.util.Stack;

public class BrowserHistory {
    public static void main(String[] args) {

        Stack<String> history = new Stack<>();
        history.push("Home");
        history.push("Login");
        history.push("Dashboard");

        System.out.println("Current Page: " + history.peek());
        System.out.println("Back: " + history.pop());
        System.out.println("Now On: " + history.peek());
    }
}
