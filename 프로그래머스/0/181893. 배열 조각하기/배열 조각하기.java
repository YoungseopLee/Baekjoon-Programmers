import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        List<Integer> arrList = Arrays.stream(arr)
            .boxed().collect(Collectors.toList());
        
        for(int i=0; i<query.length; i++){
            int idx = query[i];
            
            if(i%2==0)
                arrList = arrList.subList(0, idx+1);
            else
                arrList = arrList.subList(idx, arrList.size());
        }   
        
        
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}