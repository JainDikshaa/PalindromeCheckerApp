import java.util.*;

class PalindromeService {

    public boolean checkPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        if(service.checkPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}