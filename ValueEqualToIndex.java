public class ValueEqualToIndex {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            int val = nums.get(i);
            if(i==val-1){
                result.add(val);
            }
        }
        return result;
    }
}
