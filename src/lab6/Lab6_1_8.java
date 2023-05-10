package lab6;

import java.util.Stack;

public class Lab6_1_8 {
    public static void main(String[] args) {
        String str = "([]{()})";

        if (isValid(str)) {
            System.out.println("Правильная расстановка скобок");
        } else {
            System.out.println("Неправильная расстановка скобок");
        }
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
