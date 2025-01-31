import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
       int n = arr.size();
        long minSum = Long.MAX_VALUE, maxSum = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long currentSum = 0;
            
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    currentSum += arr.get(j);
                }
            }

            minSum = Math.min(minSum, currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(minSum + " " + maxSum);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
