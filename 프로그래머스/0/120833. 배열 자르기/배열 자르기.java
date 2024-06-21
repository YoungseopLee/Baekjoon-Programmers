import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> list = new ArrayList<>(); 
        for(int i=num1; i<=num2; i++) list.add(numbers[i]);
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
       
        
        
        return answer;
    }
}