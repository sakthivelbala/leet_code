public class GroupedReverse {

    public int[] reverseGrouped(int[] input, int left, int right){
        while(left<right){
            int temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;
        }
        return input;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int K = 3;
        System.out.println("working");
        Main main = new Main();
        for(int i=0;i<arr.length;i+=K){
            int right = Math.min(i+K-1, arr.length-1);
            arr=main.reverseGrouped(arr,i,right);
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}
