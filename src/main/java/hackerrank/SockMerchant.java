package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int pairCounter = 0;
        List<Integer> forPairing = new LinkedList<>();
        for(int i = 0; i < ar.length; i++) {
            if(forPairing.contains(ar[i])) {
                forPairing.remove(Integer.valueOf(ar[i]));
                pairCounter++;
            } else {
                forPairing.add(ar[i]);
            }
        }
        return pairCounter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        System.out.println(sockMerchant(n, ar));

        scanner.close();
    }
}
