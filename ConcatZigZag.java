class Solution
{
    String convert(String s, int n)
    {
        // if n is less then 1 then its invalid
        // if equal to 1 or greater than length of string then result is entire string
        if(n<=1 || n >= s.length()){
            return s;
        }
        // create n string builders
        StringBuilder[] rows = new StringBuilder[n];
        for(int i=0;i<n;i++){
            rows[i] = new StringBuilder();
        }
        // current row indicator
        int currentRow = 0;
        // indicator to determine going up or down
        boolean goingDown = false;
        for(char c : s.toCharArray()){
            // append charater to current row
            rows[currentRow].append(c);
            // if current row is 0 go down if equal to n then go up
            if(currentRow == 0 || currentRow == n-1){
                goingDown = !goingDown;
            }
            // increase / decrease row based on going up or down
            currentRow += (goingDown ? 1 : -1);
        }
        StringBuilder result = new StringBuilder();
        // concatinate the result
        for(StringBuilder t : rows){
            result.append(t);
        }
        // return result
        return result.toString();
    }
}
