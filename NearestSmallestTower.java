
class Solution{
	int [] nearestSmallestTower(int [] A){
		int n = A.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        // iterate from left to right and use stack to pop till smallest to find next smallest
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        // repeat the same process for right to left
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                int rightIndex = stack.peek();
                if(result[i]==-1||
                    i-result[i]>rightIndex-i||
                    (i-result[i]==rightIndex-i&&A[rightIndex]<A[result[i]])){
                    result[i] = rightIndex;
                }
            }
            stack.push(i);
        }
        // return result
        return result;
	}
}