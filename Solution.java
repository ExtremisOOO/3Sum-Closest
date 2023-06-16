class Solution {
   public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int output = 0;
        int lengthofNums = nums.length;
        int left,right;
        int different = Integer.MAX_VALUE;
        for (int i = 0; i < lengthofNums-2; i++) {
            left = i+1;
            right = lengthofNums-1;
            while(left<right)
            {
                int sum = nums[i]+nums[left]+nums[right];
                
                if(Math.abs(target-sum)<Math.abs(different))
                different = target-sum;

                if(sum==target)
                    return target;
                else if(sum>target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return target-different;
    }   
}
