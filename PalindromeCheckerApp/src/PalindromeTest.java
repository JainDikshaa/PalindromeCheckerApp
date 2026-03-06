
    import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    class PalindromeTest {

        boolean isPalindrome(String input) {
            String reversed = new StringBuilder(input).reverse().toString();
            return input.equals(reversed);
        }

        @Test
        void testPalindromeTrue() {
            assertTrue(isPalindrome("madam"));
        }

        @Test
        void testPalindromeFalse() {
            assertFalse(isPalindrome("hello"));
        }
    }