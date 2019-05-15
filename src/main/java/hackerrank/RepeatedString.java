package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        BigInteger countOfALetterInTheOriginal = BigInteger.valueOf(countOfA(s));
        BigInteger initialStringLength = BigInteger.valueOf(s.length());

        String remainingString = s.substring(0, BigInteger.valueOf(n).mod(initialStringLength).intValue());
        BigInteger countOfALetterInTheRemaining = BigInteger.valueOf(countOfA(remainingString));

        return countOfALetterInTheOriginal
                .multiply(BigInteger.valueOf(n).divide(initialStringLength))
                .add(countOfALetterInTheRemaining)
                .longValue();
    }

    static long countOfA(String s) {
        return s.chars().filter(ch -> ch == 'a').count();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
