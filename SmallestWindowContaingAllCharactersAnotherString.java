/**
 * 
 * Given two strings s1 and s2.
 * Find the smallest window in the string s1 consisting of all the characters(including duplicates) of the string s2.
 * Return "" in case no such window is present.
 * If there are multiple such windows of the same length, return the one with the least starting index.
 * Note: All characters are in lowercase letters. 
 */

class Solution {
    // Function to find the smallest window in the string s consisting
    // of all the characters of string p.
    public static String smallestWindow(String s1, String s2) {
        // count the occurance of each character
        Map<Character, Integer> charCountMap = new HashMap<>();
        for(char c : s2.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
        }
        //check occurance and slide window to find smallest window.
        Map<Character, Integer> windowCount = new HashMap<>();
        int left=0, right=0, formed=0, required = charCountMap.size(), minLength=Integer.MAX_VALUE, minLeft = 0;
        while(right < s1.length()){
            // add each character to window count
            char currentChar = s1.charAt(right);
            windowCount.put(currentChar, windowCount.getOrDefault(currentChar,0)+1);
            if(charCountMap.containsKey(currentChar) && charCountMap.get(currentChar).intValue() == windowCount.get(currentChar).intValue()){
                formed++;
            }
            // if substring contains all the chars reduct left to find minimum
            while(left<=right && formed==required){
                int currentLength = right-left+1;
                if(currentLength < minLength){
                    minLength = currentLength;
                    minLeft = left;
                }
                char leftChar = s1.charAt(left);
                windowCount.put(leftChar, windowCount.get(leftChar)-1);
                if(charCountMap.containsKey(leftChar) && charCountMap.get(leftChar).intValue() > windowCount.get(leftChar).intValue()){
                    formed--;
                }
                left++;
            }
            right++;
        }
        // return substring
        return minLength == Integer.MAX_VALUE ? "" : s1.substring(minLeft, minLeft + minLength);
    }
}