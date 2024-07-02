import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){ // "l" 이전까지 문자열 새로 저장
                answer = IntStream.range(0, i).mapToObj(j->str_list[j])
                    .toArray(String[]::new);
                break;
            }else if(str_list[i].equals("r")){ // "r" 이후의 문자열 새로 저장
                answer = IntStream.range(i+1, str_list.length)
                    .mapToObj(j->str_list[j]).toArray(String[]::new);
                break;
            }
        }
        
        return answer;
    }
}