import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = Integer.toString(age);
        Map<Character, Character> intToChar = new HashMap<>(); 
        
        // age to a~j -> 0:a, 1:b, 2:c ... 9:j 
        intToChar.put('0', 'a');
        intToChar.put('1', 'b');
        intToChar.put('2', 'c');
        intToChar.put('3', 'd');
        intToChar.put('4', 'e');
        intToChar.put('5', 'f');
        intToChar.put('6', 'g');
        intToChar.put('7', 'h');
        intToChar.put('8', 'i');
        intToChar.put('9', 'j');
        
        for(int i=0; i<str.length(); i++){
            answer += intToChar.get(str.charAt(i));
        }
        
        return answer;
    }
}