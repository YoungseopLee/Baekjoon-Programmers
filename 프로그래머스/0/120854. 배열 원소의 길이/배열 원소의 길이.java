import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] strlist) {
        
        List<Integer> list = new ArrayList<>();
        
        for(String str : strlist){
            list.add(str.length());
        }
        
//         int[] answer = new int[list.size()];
        
//         for(int i=0; i<list.size(); i++){
//             answer[i] = list.get(i);
//         }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}