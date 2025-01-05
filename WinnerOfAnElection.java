class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // find maxVote
        int maxVote = 0;
        Map<String, Integer> voteCount = new HashMap<>();
        for(String a : arr){
            voteCount.put(a, voteCount.getOrDefault(a,0)+1);
            if(voteCount.get(a) > maxVote){
                maxVote = voteCount.get(a);
            }
        }
        // filter winners with maxVote
        List<String> winners = new ArrayList<>();
        for(Map.Entry<String, Integer> e : voteCount.entrySet()){
            if(e.getValue() == maxVote){
                winners.add(e.getKey());
            }
        }
        //if more than one winner get the lexigraphically ordered first person
        String winner = winners.stream().sorted().findFirst().get();
        //return winner with votes
        return new String[]{winner, String.valueOf(maxVote)};
    }
}

