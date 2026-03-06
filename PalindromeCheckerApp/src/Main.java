import java.util.*;

public class Main {

    public static boolean isPalindrome(String input) {

        input = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        while(left < right) {
            if(input.charAt(left) != input.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        if(isPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}