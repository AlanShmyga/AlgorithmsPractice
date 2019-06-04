package strings;

import java.util.Arrays;

public class StringRoutines {

    public static final String TEST_STRING = "Some string";

    public static void main(String[] args) {
        print(TEST_STRING);
        print(stringReverse());
        print(sortString(TEST_STRING));
        print(stringReverse());
    }

    private static String sortString(String toSort) {
        char[] s = toSort.toCharArray();
        Arrays.sort(s);
        return String.valueOf(s).trim();
    }

    private static void print(String s) {
        System.out.println(s);
    }

    private static String stringReverse() {
        return new StringBuffer(TEST_STRING).reverse().toString();
    }
}
