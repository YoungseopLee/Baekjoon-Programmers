class Solution {
    public int solution(int num, int k) {
        
        int answer = -1;
        
        String strNum = num+"";
        String strK = k+"";
        
        for(int i=0; i<strNum.length(); i++){
            if(strNum.charAt(i) == strK.charAt(0))
                return i+1;  
        }
        
        return answer;
    }
}