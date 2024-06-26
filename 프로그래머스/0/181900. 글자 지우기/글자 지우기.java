import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[] indices) {
        
        List<Character> list = my_string.chars()
            .mapToObj(c->(char) c)
            .collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<indices.length; i++){
            list.set(indices[i], '_');
        }

        list.removeIf(c->c == '_');
                  
        for(Character ch : list){
            sb.append(ch);
        }
             
        return sb.toString();
    }
}