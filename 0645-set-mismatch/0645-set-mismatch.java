class Solution {
        public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2];
        boolean[] seen = new boolean[n+1]; 
        
        for (int num : nums) {
            if (seen[num]) {
                result[0] = num;
            }
            seen[num] = true;
        }
        
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                result[1] = i;
                break;
            }
        }
        return result;
    }

}