package practiceExercise_Task;

public class StringFunctions {
    public static void main(String[] args) {
        String str = " Hello Java World ";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 6: " + str.charAt(6));

        // 3. substring()
        System.out.println("Substring (6, 10): " + str.substring(6, 10));

        // 4. indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // 5. lastIndexOf()
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // 6. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 7. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 8. trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 9. replace()
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // 10. contains()
        System.out.println("Contains 'World'? " + str.contains("World"));

        // 11. split()
        String[] words = str.trim().split(" ");
        System.out.println("Words after split:");
        for (String word : words) {
            System.out.println(word);
        }

        // 12. equals()
        String anotherStr = " Hello Java World ";
        System.out.println("Equals another string? " + str.equals(anotherStr));

        // 13. equalsIgnoreCase()
        System.out.println("EqualsIgnoreCase ' hello java world '? " + str.trim().equalsIgnoreCase("hello java world"));

        // 14. startsWith()
        System.out.println("Starts with ' Hello'? " + str.startsWith(" Hello"));

        // 15. endsWith()
        System.out.println("Ends with 'World '? " + str.endsWith("World "));
    }
}

