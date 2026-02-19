import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray())
            stack.push(c);

        String reversed = "";
        while(!stack.isEmpty())
            reversed += stack.pop();

        if(input.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
