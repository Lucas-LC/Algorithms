package colorful.number;

import java.util.HashSet;

public class ColorfulNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        long num = 326;
        System.out.println(isColorfulNumber(num));
    }

    public static boolean isColorfulNumber(long N) {
        HashSet<Long> set = new HashSet<>();
        String str = Long.toString(N);
        int[] numb = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            numb[i] = Character.getNumericValue(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            long product = 1;
            for (int j = i; j < str.length(); j++) {
                product = numb[j] * product;
                if (!set.contains(product)) {
                    set.add(product);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
