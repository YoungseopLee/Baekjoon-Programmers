import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
      
        int answer = 1;
        
        Map<Integer, Integer> lengthCountMap = new HashMap<>();
        
        for(String str : strArr){
            int length = str.length();
            lengthCountMap.put(length, 
                        lengthCountMap.getOrDefault(length, 0) + 1);
        }
        
        return lengthCountMap.values().stream().max(Integer::compareTo)
            .orElseThrow(() -> new IllegalArgumentException(""));
    }
}