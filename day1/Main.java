import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int n = 110;
        
        Map<Integer, String> fizzBuzzMap = new HashMap<>();
        fizzBuzzMap.put(3, "fizz");
        fizzBuzzMap.put(5, "buzz");
        fizzBuzzMap.put(7, "Lazz");

        for (int i = 1; i < n + 1; i++) {
            String s = "";
            for (Map.Entry<Integer, String> fbm: fizzBuzzMap.entrySet()) {
                if (i % fbm.getKey() == 0) {
                    s += fbm.getValue();
                }
            }

            if (s == "") {
                System.out.println(i);
            }
            else {
                System.out.println(s);
            }
        }
    }
}