package hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class Anagrams {

    public static void main(String[] args) {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        List<Character> aChars = a.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        List<Character> bChars = b.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        List<Character> result = new ArrayList<>();

        for (int i = 0; i < aChars.size(); i++) {
            char c = aChars.get(i);
            if (bChars.contains(c)) {
                aChars.remove(i);
                bChars.remove(bChars.indexOf(c));
                i = i - 1;
            } else {
                result.add(c);
            }
        }
        for (char c : bChars) {
            if (!aChars.contains(c)) {
                result.add(c);
            }
        }
    }
}
