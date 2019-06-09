package hackerrank;

import java.util.*;

public class NewYearChaos {

    // Complete the minimumBribes function below.
    private static void minimumBribes(int[] q) {
        int bribes = 0;

        Map<Integer, Integer> movements = new TreeMap<>();
        int attemptsInThisIteration;

        do {
            attemptsInThisIteration = 0;
            for(int i=0; i< q.length; i++) {
                if (i == q.length - 1) {
                    continue;
                }
                if (q[i] > q[i + 1]) {
                    if (getMovementsNumber(movements, q[i]) < 2) {
                        makeAMove(q, i);
                        movements.put(q[i+1], getMovementsNumber(movements, q[i+1]) + 1);
                        bribes++;
                        attemptsInThisIteration++;
                    } else {
                        System.out.println("Too chaotic");
                        return;
                    }
                }
            }
        } while (attemptsInThisIteration > 0);


        System.out.println(bribes);
    }

    private static int getMovementsNumber(Map<Integer, Integer> movements, int i) {
        if(movements.get(i) == null) {
            return 0;
        }
        return movements.get(i);
    }

    private static void makeAMove(int[] q, int i) {
        int temp = q[i];
        q[i] = q[i + 1];
        q[i + 1] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
