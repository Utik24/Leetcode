public class ConcatenationOfArray {
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int[] l = new int[nums.length * 2];
            System.arraycopy(nums, 0, l, 0, nums.length);
            System.arraycopy(nums, 0, l, nums.length, l.length - nums.length);
            return l;
        }
    }
}
