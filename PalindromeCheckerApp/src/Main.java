import java.util.*;

public class Main {

    // Method 1: StringBuilder reverse
    public static boolean checkPalindromeReverse(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Method 2: Two-pointer method
    public static boolean checkPalindromeTwoPointer(String input) {
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
        System.out.print("Enter word: ");
        String input = sc.nextLine();

        // Method 1 timing
        long start1 = System.nanoTime();
        boolean result1 = checkPalindromeReverse(input);
        long end1 = System.nanoTime();

        // Method 2 timing
        long start2 = System.nanoTime();
        boolean result2 = checkPalindromeTwoPointer(input);
        long end2 = System.nanoTime();

        System.out.println("Reverse Method: " + result1);
        System.out.println("Time taken: " + (end1 - start1) + " ns");

        System.out.println("Two Pointer Method: " + result2);
        System.out.println("Time taken: " + (end2 - start2) + " ns");

        sc.close();
    }
}