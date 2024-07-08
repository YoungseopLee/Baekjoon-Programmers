import java.util.Arrays;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        char temp = my_string.charAt(num1);
        
        char[] charArray = my_string.toCharArray();
        
        charArray[num1] = charArray[num2];
        charArray[num2] = temp; 
        
        return new String(charArray);
    }
}