import java.util.Stack;
import java.util.Scanner;

public class validParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;}
                char top = stack.pop();
if (c == ')' && top != '(') {
                    return false;}
                if (c == ']' && top != '[') {
                    return false;
                }
if (c == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter str: ");
        String input = sc.nextLine();
        if (isValid(input)) {
            System.out.println("valid");
        } else {  System.out.println("not valid");
}
        sc.close();
    }
}
