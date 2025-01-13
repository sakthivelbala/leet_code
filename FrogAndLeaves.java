class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        Set<Integer> visited = new HashSet<>();
        //create a set of visited leaves
        for(int strength : frogs){
            if(strength<=leaves && !visited.contains(strength)){
                for(int i=strength; i<=leaves; i+=strength){
                    visited.add(i);
                }
            }
        }
        // return number of leaves - set length
        return leaves - visited.size();
    }
}