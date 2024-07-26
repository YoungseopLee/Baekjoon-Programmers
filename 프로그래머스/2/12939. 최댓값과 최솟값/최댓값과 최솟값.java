import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] tokens = s.trim().split("\\s+");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE; 
        
        for(String token : tokens){
            try{
                int num = Integer.parseInt(token);
                if(num < min) min = num; 
                if(num > max) max = num;
            }catch(NumberFormatException e){
                System.out.println("잘못된 숫자 형식 입니다. -> " + token);
            }
        }
        
        answer = Integer.toString(min) + " " + Integer.toString(max);
        
        return answer;
    }
}