/**
 * Minimum Platforms
 * You are given the arrival times arr[] and departure times dep[] of all trains that arrive at a railway station on the same day. Your task is to determine the minimum number of platforms required at the station to ensure that no train is kept waiting.
 * At any given time, the same platform cannot be used for both the arrival of one train and the departure of another. Therefore, when two trains arrive at the same time, or when one arrives before another departs, additional platforms are required to accommodate both trains.
 */


class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        //sort the arrival and departure times
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int i=0, j=0,platformCount=0,maxPlatform=0;;
        while(i<n&&j<n){
            // if a train arrives increase the platformCount
            if(arr[i]<=dep[j]){
                platformCount++;
                i++;
                // if the max platform is less than platform count then max platform is the platform count
                if(platformCount>maxPlatform){
                    maxPlatform = platformCount;
                }
            } else {
                // if the train departures decreasee the platform count
                platformCount--;
                j++;
            }
        }
        return maxPlatform;

    }
}

