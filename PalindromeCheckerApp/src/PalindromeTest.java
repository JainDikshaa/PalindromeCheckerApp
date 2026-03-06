class PalindromeTest {

    boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public static void main(String[] args) {

        PalindromeTest test = new PalindromeTest();

        System.out.println("madam -> " + test.isPalindrome("madam"));
        System.out.println("hello -> " + test.isPalindrome("hello"));
    }
}