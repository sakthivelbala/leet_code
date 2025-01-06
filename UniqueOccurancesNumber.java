// Unique Number of Occurrences (# 1207)

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> uniques = new HashSet<>();
        Map<Integer, Integer> occurances = new HashMap<>();
        // find occurances of each numbers
        for(int a:arr){
            occurances.put(a,occurances.getOrDefault(a,0)+1);
        }
        // if occurances repeat the return false
        for(Map.Entry<Integer, Integer> e : occurances.entrySet()){
            if(uniques.contains(e.getValue())){
                return false;
            }
            uniques.add(e.getValue());
        }
        // else return true
        return true;
    }
}
