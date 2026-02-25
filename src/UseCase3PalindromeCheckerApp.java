public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded string
        String word = "level";

        // String to store reversed word
        String reversed = "";

        // Loop to reverse string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare and display result
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

    }
}

