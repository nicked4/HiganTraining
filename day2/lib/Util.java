package lib;

public class Util {
    public static String format(int n) {
        String s = String.valueOf(n);
        String commaS = "";

        int length = s.length();
        for (int i = 0; i < length; i++) {
            commaS = s.charAt(length - 1 - i) + commaS;
            if (i % 3 == 2 && length - 1 - i > 0) {
                commaS = "," + commaS;
            }
        }

        return commaS;
    }
}
