class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int index=0 ;
        for (int i = 0; i < nums.length; i++) {
            if(val==nums[i]) {
                continue;
            }
            else {
                count++;
                nums[index] = nums[i] ;
                index++;
            }

        }
        return count;
    }
        
    
}