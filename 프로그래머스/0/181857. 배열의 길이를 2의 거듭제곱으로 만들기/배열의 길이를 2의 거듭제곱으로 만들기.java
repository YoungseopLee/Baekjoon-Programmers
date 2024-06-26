import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
       
        List<Integer> result = Arrays.stream(arr)
            .boxed().collect(Collectors.toList());
        
         
        int original = arr.length;
        int modified = isPowerOfTwo(original);

        for(int i=0; i<modified-original; i++){
            result.add(0);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int isPowerOfTwo(int n){
        
        if(n <= 0){ // 0 이거나 보다 작으면 1 반환
            return 1;
        }
        
        if((n & (n-1)) == 0){ // 이미 거듭제곱이면 그대로 반환 
            return n;
        }
        
        int power = 1; 
        while(power <= n){
            power *= 2;
        }
        
        return power;
        
    }
    
}