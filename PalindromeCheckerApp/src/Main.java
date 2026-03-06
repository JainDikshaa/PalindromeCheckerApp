import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // remove spaces and convert to lowercase
        input = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(input).reverse().toString();

        if(input.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}