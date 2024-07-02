import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        int i=0;
        while(i<arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else{
                if(stk.get(stk.size()-1).equals(arr[i])){
                    stk.remove(stk.size()-1);
                    i++;
                }else{
                    stk.add(arr[i]);
                    i++;
                }
            }
        }
        
        if(stk.isEmpty())
            stk.add(-1);
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}