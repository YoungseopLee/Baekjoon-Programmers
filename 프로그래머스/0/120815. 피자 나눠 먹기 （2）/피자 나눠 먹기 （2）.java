class Solution {
    public int solution(int n) { 
        int answer = ((n*6)/getGCD(n, 6))/6;
        
        return answer;
    }
    
    public int getGCD(int a, int b){
        
        while(b!=0){
            int temp = b;
            b = a%b;
            
            a = temp;
        }
        
        return a;
    }

}