import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        String answer = "";
        int[] intArray = new int[my_string.length()];
        
        for(int i=0; i<my_string.length(); i++){
            
            char ch = my_string.charAt(i);
            if(Character.isUpperCase(ch))
                intArray[i] = (int)ch + 32;
            else 
                intArray[i] = (int)ch;
        }
        
        Arrays.sort(intArray);
        
        for(int i : intArray)
            answer += (char)i;    
            
        return answer;
    }
}