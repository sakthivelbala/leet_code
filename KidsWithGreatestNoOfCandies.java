// Kids With the Greatest Number of Candies (LeetCode #1431)

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCount = Integer.MIN_VALUE;
        // find the maximum count of existing candies among the kids
        for(int i : candies){
            if(i>maxCount){
                maxCount = i;
            }
        }
        // check if givig extraCandies for each kid equals or exceeds the maximum found
        List<Boolean> result = new ArrayList<>();
        for(int i : candies) {
            if(i+extraCandies >= maxCount){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        // return result
        return result;
    }
}