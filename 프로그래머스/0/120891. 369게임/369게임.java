class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String orderToString = String.valueOf(order);
        
        for(int i=0; i<orderToString.length(); i++){
            if(orderToString.charAt(i) == '3' 
               || orderToString.charAt(i) == '6'
               || orderToString.charAt(i) == '9')
                answer += 1;
        }
        
        return answer;
    }
}