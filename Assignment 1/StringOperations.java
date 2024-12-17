
// Class to perform string operations such as converting to uppercase and checking for palindromes
public class StringOperations {

    // Method to convert a given string to uppercase
    public String toUpperCase(String input) {
        // Use the built-in toUpperCase() method of the String class
        return input.toUpperCase();
    }

    // Method to check if a given string is a palindrome
    public boolean isPalindrome(String input) {
        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();
        // Check if the original string equals the reversed string, ignoring case
        return input.equalsIgnoreCase(reversed);
    }

    // Main method to test the functionality of the methods
    public static void main(String[] args) {
        // Create an instance of the StringOperations class
        StringOperations operations = new StringOperations();

        // Test strings
        String testString1 = "hello";  // Example of a non-palindrome string
        String testString2 = "racecar"; // Example of a palindrome string

        // Test the toUpperCase method and print the result
        System.out.println("Uppercase of '" + testString1 + "': " + operations.toUpperCase(testString1));
        
        // Test the isPalindrome method and print the result
        System.out.println("'" + testString2 + "' is palindrome? " + operations.isPalindrome(testString2));
    }
}


