import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class GreatestCommonDivisorOfStrings {
    class Solution {
        public int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public Set<Integer> getDivisiors(int a, int b) {
            Set<Integer> divisors = new TreeSet<>(Comparator.reverseOrder());
            int commonGcd = gcd(a, b);
            for (int i = 1; i * i <= commonGcd; i++) {
                if (commonGcd % i == 0) {
                    divisors.add(i);
                    divisors.add(commonGcd / i);
                }
            }
            return divisors;
        }

        public String gcdOfStrings(String str1, String str2) {
            int lenStr1 = str1.length();
            String strCommon;
            int lenStr2 = str2.length();
            Set<Integer> divisors = getDivisiors(lenStr1, lenStr2);
            for (int divisor : divisors) {
                strCommon = str1.substring(0, divisor);
                String first = str1;
                String second = str2;
                if (strCommon.equals(str2.substring(0, divisor))) {
                    boolean flag = true;
                    while (!first.isBlank() || !second.isBlank()) {
                        if (!first.isBlank()) {
                            if (first.substring(0, divisor).equals(strCommon)) {
                                first = first.substring(divisor);
                            } else {
                                flag = false;
                                break;
                            }
                        }
                        if (!second.isBlank()) {
                            if (second.substring(0, divisor).equals(strCommon)) {
                                second = second.substring(divisor);
                            } else {
                                flag = false;
                                break;
                            }
                        }
                    }
                    if (flag) {
                        return str1.substring(0, divisor);
                    }
                }
            }
            return "";
        }


    }

}
