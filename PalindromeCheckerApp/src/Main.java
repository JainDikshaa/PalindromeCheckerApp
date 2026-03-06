import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        for(char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while(list.size() > 1) {
            if(list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}