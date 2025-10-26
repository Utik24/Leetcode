public class DivisibleAndNonDivisibleSumsDifference {
    class Solution {
        public int differenceOfSums(int n, int m) {
            int sum1 = 0;
            int sum2 = 0;
            int[] list1 = new int[n + 1];
            int[] list2 = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                if (i % m == 0) {
                    list2[i] = i;
                } else {
                    list1[i] = i;
                }
            }
            for (int i = 0; i <= n; i++) {
                sum1 += list1[i];
            }
            for (int i = 0; i <= n; i++) {
                sum2 += list2[i];
            }
            return sum1 - sum2;
        }
    }
}
