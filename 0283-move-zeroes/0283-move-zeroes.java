class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[a]=nums[i];
                a++;
                count++;
            }

        }
        for(int j=a;j<nums.length;j++){
            nums[j]=0;
        }
        
    }
}