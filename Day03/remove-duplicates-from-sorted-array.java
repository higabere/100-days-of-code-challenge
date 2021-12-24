class Solution {
    public int removeDuplicates(int[] nums) {
        
        int verde = 0;
        int size = nums.length;
        
        for(int azul=1; azul< size; azul++){
          if(nums[azul] != nums[verde]){
              verde++;
              nums[verde] = nums[azul];
          } 
          
              
        }
        return verde + 1;
    }
}