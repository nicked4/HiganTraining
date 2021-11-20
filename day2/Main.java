import java.util.List;

import lib.Fibonacci;
import lib.Util;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** fibonacci(10) == 55 ***");
        int n = Fibonacci.calc(10);
        System.out.println(n);

        System.out.println("\n*** [1, 1, 2, 3, 5, 8, 13, 21, 34, 55] ***");
        List<Integer> ns = Fibonacci.generateList(10);
        System.out.println(ns);

        System.out.println("\n*** format test ***");
        System.out.println(Util.format(1));
        System.out.println(Util.format(12));
        System.out.println(Util.format(123));
        System.out.println(Util.format(1234));
        System.out.println(Util.format(12345));
        System.out.println(Util.format(123456));
        System.out.println(Util.format(1234567));
        System.out.println(Util.format(12345678));
        System.out.println(Util.format(123456789));
        System.out.println(Util.format(1234567890));

        System.out.println("\n*** format(fibonnaci(20)) ***");
        System.out.println(Util.format(Fibonacci.calc(35)));
    }
}
