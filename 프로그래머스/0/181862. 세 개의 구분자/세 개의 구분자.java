import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String myStr) {
        
        String[] abc = {"a", "b", "c"};
        
        for(int i=0; i<abc.length; i++)
            myStr = myStr.replace(abc[i], "_");
        
        String[] splitStr = myStr.split("_");
        List<String> filteredList = Arrays.stream(splitStr)
            .filter(str->!str.isEmpty())
            .collect(Collectors.toList());
        
        if(filteredList.isEmpty())
            return new String[] {"EMPTY"};
        else
            return filteredList.toArray(new String[0]);
    
    }
}