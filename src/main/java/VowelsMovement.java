import java.util.Arrays;
import java.util.Scanner;

public class VowelsMovement {

    //move all vowels to one side in a random string
    private static String moveVovels(String in) {
        StringBuilder result = new StringBuilder();
        char[] inArray = in.toCharArray();
        Arrays.sort(inArray);
        for(char c : inArray) {
            if (isVowel(c)) {
                result.append(c);
            }
        }
        for(char c : inArray) {
            if (!isVowel(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(moveVovels(input));
    }
}
