package JAVA.Fundamentals;

class abc9 {
    public static void main(String[] args) {
        String str = "  Hello, Java World!  ";
        String str2 = "hello, java world!";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. trim()
        System.out.println("Trim: '" + str.trim() + "'");

        // 3. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 5. charAt()
        System.out.println("Char at 1: " + str.charAt(1));

        // 6. substring()
        System.out.println("Substring (2,7): " + str.substring(2, 7));

        // 7. contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 8. equals()
        System.out.println("Equals str2: " + str.equals(str2));

        // 9. equalsIgnoreCase()
        System.out.println("Equals Ignore Case str2: " + str.trim().equalsIgnoreCase(str2.trim()));

        // 10. startsWith()
        System.out.println("Starts with '  He': " + str.startsWith("  He"));

        // 11. endsWith()
        System.out.println("Ends with '!  ': " + str.endsWith("!  "));

        // 12. indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // 13. lastIndexOf()
        System.out.println("Last Index of 'a': " + str.lastIndexOf('a'));

        // 14. replace()
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // 15. split()
        String[] parts = str2.split(",");
        System.out.println("Split by ',': ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
