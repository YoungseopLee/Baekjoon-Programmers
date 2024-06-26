import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> intList = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            if(Integer.parseInt(intStrs[i].substring(s, s+l)) > k)
                intList.add(Integer.parseInt(intStrs[i].substring(s, s+l)));
        }
        
        return intList.stream().mapToInt(i -> i).toArray();
    }
}