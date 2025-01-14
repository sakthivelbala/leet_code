class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        // create set for one array
        Set<Integer> aSet = new HashSet<>();
        for(int n : a){
            aSet.add(n);
        }
        // iterate through second array and count if found in set
        int count = 0;
        for(int n : b){
            if(aSet.contains(n)){
                count++;
            }
        }
        // return count
        return count;
    }
}