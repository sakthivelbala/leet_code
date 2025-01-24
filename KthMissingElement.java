public class KthMissingElement {
    int KthMissingElement(int arr[], int k) {
        // take first element
        int front = arr[0];
        for(int i=1;i<arr.length;i++){
            // calculate the difference on each element with element before
            int diff = arr[i]-front;
            if(diff>1){
                // if diff greater than 1 then find number of values missed
                int missed = diff-1;
                // missed greater than k then calculate value to return
                if(k<=missed){
                    return front+k;
                }
                // else reduce the k with missed elements
                k-=missed;
            }
            front = arr[i];
        }
        return -1;
    }
}
