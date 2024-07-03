import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        List<Integer> answer = new ArrayList<>();
        List<Integer> tList = new ArrayList<>();
        
        for(int i=0; i<queries.length; i++){
            
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j=s; j<=e; j++){
                if(arr[j] > k){
                    tList.add(arr[j]);
                }
            }
            
            if(tList.isEmpty()){
                answer.add(-1);
            }else{
                answer.add(Collections.min(tList));
                tList.clear();
            }
        }
            
            
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}