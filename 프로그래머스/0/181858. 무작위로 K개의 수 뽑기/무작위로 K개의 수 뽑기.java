import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        List<Integer> list = Arrays.stream(arr)
            .distinct().boxed().collect(Collectors.toList());
        
        int l = list.size();
        
        if(l > k){ // 중복이 제거된 리스트의 길이가 k 보다 길다. 
            for(int i=l; i>k; i--)
                list.remove(i-1);
        }else{
            for(int i=l; i<k; i++)
                list.add(-1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}