// Merge Strings Alternately (LeetCode #1768)

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        //iterate through each character of both words and add it to the string builder alternatively
        while(i<word1.length() && i<word2.length()){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        // append remaining characters to the string of anything left in any one of the string.
        while(i<word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        while(i<word2.length()){
            sb.append(word2.charAt(i));
            i++;
        }
        // return the result.
        return sb.toString();
    }
}