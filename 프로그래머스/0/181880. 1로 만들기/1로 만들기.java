class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i=0; i<num_list.length; i++){
            answer += divide(num_list[i]);
        }
        
        return answer;
    }
    
    public int divide(int n){
        
        int count = 0;
        
        while(n>=1){
            if(n % 2 == 0){
                n /= 2;
                count += 1;
            }else{
                n -= 1;
                
                if(n != 0){
                    n /= 2;
                    count += 1;
                }
            }
        }
        return count;
    }
}