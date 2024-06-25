import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers, String direction) {
            
        List<Integer> nList = new ArrayList<>();
    
        if(direction.equals("right")){
            nList.add(numbers[numbers.length-1]);
            for(int i=0; i<numbers.length-1; i++)
                nList.add(numbers[i]);
            System.out.println(nList);
        }else if(direction.equals("left")){
            for(int i=1; i<numbers.length; i++)
                nList.add(numbers[i]);
            nList.add(numbers[0]);
            System.out.println(nList);
        }
        
        int[] answer = nList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}