class Solution {
    public String removeStars(String s) {
        //create a stack
        Stack<String> stack = new Stack<>();
        String[] characters = s.split("");
        for(String c : characters){
            // if found * pop from stack
            if(c.equals("*")){
                stack.pop();
            } else {
                // else push to stack
                stack.push(c);
            }
        }
        // convert stack to string
        StringBuilder sb = new StringBuilder();
        for(String t : stack){
            sb.append(t);
        }
        // return the result
        return sb.toString();
    }
}