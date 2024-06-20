class Solution {
    public int solution(int n) {
        
        int answer = 0;
        
        String nStr = Integer.toString(n);
        
        for(char c : nStr.toCharArray()){
            answer += Character.getNumericValue(c);
        }
        
        return answer;
    }
}