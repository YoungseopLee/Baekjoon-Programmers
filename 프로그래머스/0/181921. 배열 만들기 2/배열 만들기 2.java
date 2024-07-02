import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> nlist = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            if(containsOnlyFiveOrZero(i))
                nlist.add(i);
        }
        
        if(nlist.isEmpty())
            nlist.add(-1);        
        
        return nlist.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private static boolean containsOnlyFiveOrZero(int i){
        String iStr = String.valueOf(i);
        for(char ch : iStr.toCharArray()){
            if(ch != '5' && ch != '0')
                return false;
        }
        
        return true;
    }
    
}