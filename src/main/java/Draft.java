import java.math.BigInteger;

public class Draft {

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

    public static void main(String[] args) {
        long n = 736778906400L;
        String s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";

        System.out.println(repeatedString(s, n));
    }
}
