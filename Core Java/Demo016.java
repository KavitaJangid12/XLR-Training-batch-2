import java.util.Scanner;

public class Demo016 {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Convert the word to lowercase for case-insensitive comparison
        String original = word.toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString();

        // Check if the word is a palindrome
        if (original.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}