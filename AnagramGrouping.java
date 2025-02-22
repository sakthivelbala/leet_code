import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramGrouping {
    public static void main(String[] args){
        String[] strArr ={"abc","god","cab", "bca", "dog","cat"};
        Map<String, List<String>> result = new HashMap<>();
        for(String a : strArr){
            String temp = Arrays.asList(a.split("")).stream().sorted().collect(Collectors.joining(""));
            if(result.containsKey(temp)){
                result.get(temp).add(a);
            } else {
                result.put(temp, new ArrayList<String>(){{add(a);}});
            }
        }
        for(Map.Entry<String, List<String>> entry : result.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
