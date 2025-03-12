public class StringMethodsDemo {
    public static void main(String[] args) {

        System.out.println("KRISHNA - 00214902024");
        // Initialize a sample string
        String str = "Hello, World!";
        
        // 1. length() - Returns the length of the string
        System.out.println("Length of the string: " + str.length());

        // 2. charAt() - Returns the character at the specified index
        System.out.println("Character at index 7: " + str.charAt(7));

        // 3. substring() - Returns a new string that is a substring of the original string
        System.out.println("Substring from index 7: " + str.substring(7));

        // 4. toLowerCase() - Converts the string to lowercase
        System.out.println("String in lowercase: " + str.toLowerCase());

        // 5. toUpperCase() - Converts the string to uppercase
        System.out.println("String in uppercase: " + str.toUpperCase());

        // 6. equals() - Compares two strings for equality (case-sensitive)
        String str2 = "Hello, World!";
        String str3 = "hello, world!";
        System.out.println("str equals str2: " + str.equals(str2)); // true
        System.out.println("str equals str3: " + str.equals(str3)); // false

        // 7. equalsIgnoreCase() - Compares two strings for equality (ignores case)
        System.out.println("str equalsIgnoreCase str3: " + str.equalsIgnoreCase(str3)); // true

        // 8. contains() - Checks if the string contains a specific sequence of characters
        System.out.println("Contains 'World': " + str.contains("World")); // true
        System.out.println("Contains 'Java': " + str.contains("Java")); // false

        // 9. indexOf() - Returns the index of the first occurrence of a character or substring
        System.out.println("Index of 'World': " + str.indexOf("World")); // 7
        System.out.println("Index of 'o': " + str.indexOf("o")); // 4

        // 10. replace() - Replaces all occurrences of a character or substring with another
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // 11. trim() - Removes leading and trailing whitespaces
        String strWithSpaces = "  Hello, World!  ";
        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'");

        // 12. split() - Splits the string into an array based on a delimiter
        String[] words = str.split(" ");
        System.out.println("Words in string:");
        for (String word : words) {
            System.out.println(word);
        }

        // 13. startsWith() - Checks if the string starts with a specific prefix
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello")); // true
        System.out.println("Starts with 'World': " + str.startsWith("World")); // false

        // 14. endsWith() - Checks if the string ends with a specific suffix
        System.out.println("Ends with 'World!': " + str.endsWith("World!")); // true
        System.out.println("Ends with 'Hello': " + str.endsWith("Hello")); // false

        // 15. concat() - Concatenates two strings
        String str4 = " Have a great day!";
        System.out.println("Concatenated string: " + str.concat(str4));

        // 16. valueOf() - Converts different data types to string (e.g., int, boolean)
        int num = 123;
        boolean flag = true;
        System.out.println("Value of num: " + String.valueOf(num));
        System.out.println("Value of flag: " + String.valueOf(flag));
    }
}
