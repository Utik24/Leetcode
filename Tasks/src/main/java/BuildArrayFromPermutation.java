public class BuildArrayFromPermutation {
    class Solution {
        public int[] buildArray(int[] nums) {
            int[] list = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                list[i]=nums[nums[i]];
            }
            return list;
        }
    }
}
