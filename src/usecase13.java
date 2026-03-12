import java.util.*;

public class usecase13 {

    // Method 1: Simple two-pointer
    public static boolean twoPointerPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Using StringBuilder reverse
    public static boolean stringBuilderPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 3: Using Stack
    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\n=== Performance Comparison ===");

        // Two-pointer method
        long start = System.nanoTime();
        boolean result1 = twoPointerPalindrome(input);
        long end = System.nanoTime();
        System.out.println("Two-Pointer: " + result1 + ", Time: " + (end - start) + " ns");

        // StringBuilder reverse method
        start = System.nanoTime();
        boolean result2 = stringBuilderPalindrome(input);
        end = System.nanoTime();
        System.out.println("StringBuilder Reverse: " + result2 + ", Time: " + (end - start) + " ns");

        // Stack method
        start = System.nanoTime();
        boolean result3 = stackPalindrome(input);
        end = System.nanoTime();
        System.out.println("Stack Method: " + result3 + ", Time: " + (end - start) + " ns");

        sc.close();
    }
}