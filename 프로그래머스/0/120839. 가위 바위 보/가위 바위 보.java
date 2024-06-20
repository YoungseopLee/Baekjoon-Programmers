
class Solution {
    public String solution(String rsp) {
        
        String answer = "";
        
        for(char s : rsp.toCharArray()){
            if(s == '2') answer += "0";
            else if(s == '0') answer += "5";
            else if(s == '5') answer += "2";
        }
        
        return answer;
    }
}