package hackerrank;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] tokens = s.trim().split("[ !,?._'@]");
        List<String> tokensList = Arrays.stream(tokens).filter(token -> !token.isEmpty()).collect(Collectors.toList());
        System.out.println(tokensList.size());
        tokensList.forEach(System.out::println);
        scan.close();
    }
}
