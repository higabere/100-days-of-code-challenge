class Solution {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        
        if(nums[size-1] < target ){
            return size;
        }
        
        for(int i=0; i < size; i++) {
           if (nums[i] >= target){
               return i;
           } 
        }
        return 0;
    }
}