// Maximum Average Subarray I (#643)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0,right=0;
        double sum=0;
        // find average of first k elements
        while(right<k && right<nums.length){
            sum+=nums[right];
            right++;
        }
        double average = sum/k, maxAverage = sum/k;
        // slide window of k elements and calculate average and find max
        while(right<nums.length){
            sum-=nums[left];
            sum+=nums[right];
            average=sum/k;
            maxAverage = Math.max(maxAverage, average);
            left++;
            right++;
        }
        // return maximum average
        return maxAverage;
    }
}
