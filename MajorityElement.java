class Solution {
    static int majorityElement(int arr[]) {
        // find maximum count and the value
        int maxCount = 0;
        int value = -1;
        Map<Integer, Integer> countMap = new HashMap();
        for(int a : arr){
            countMap.put(a, countMap.getOrDefault(a,0)+1);
            if(countMap.get(a)>maxCount){
                maxCount = countMap.get(a);
                value = a;
            }
        }
        // if maxcount is greater the length/2 return value else -1
        return maxCount > arr.length /2 ? value : -1;
    }
}