package test4;

public class PangramChecker {
    public static boolean isPangram(String input) {
        input = input.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (input.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String testString = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(testString);
        System.out.println("Is it a pangram? " + result);
    }
}
