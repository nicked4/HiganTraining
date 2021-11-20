package lib;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fibonacci {
    public static int calc(int n) {
        if (n < 3) {
            return 1;
        }
        else {
            return calc(n - 2) + calc(n - 1);
        }
    }

    public static List<Integer> generateList(int n) {
        return IntStream.rangeClosed(1, n)
                        .mapToObj(i -> calc(i))
                        .collect(Collectors.toList());
    }
}
