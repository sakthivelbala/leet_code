class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3){
            return false;
        }
        // initialize to max value
        int minOne = Integer.MAX_VALUE;
        int minTwo = Integer.MAX_VALUE;
        for(int num : nums){
            // if found first minimum change min one
            if(num <= minOne){
                minOne = num;
            } else if (num <= minTwo){
                // assign it to second min then the first min
                minTwo = num;
            } else {
                // if found another min found then it has triplet
                return true;
            }
        }
        // if no triplet found
        return false;
    }
}