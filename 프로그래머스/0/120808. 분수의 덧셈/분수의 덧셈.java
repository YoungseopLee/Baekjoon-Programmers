class Solution {
    public int[] solution(int numer1, int denom1, 
                          int numer2, int denom2) {   
        
        int[] answer = new int[2];

        int lcm = getLCM(denom1, denom2); // 분모 같은 수로 변환
        
        int newNumer1 = numer1 * (lcm/denom1);
        int newNumer2 = numer2 * (lcm/denom2);
        
        answer[0] = newNumer1 + newNumer2;
        answer[1] = lcm;
        
        int gcd = getGCD(answer[0], answer[1]);
        answer[0] /= gcd;
        answer[1] /= gcd;
        
        
        return answer;
    }
    
    int getGCD(int a, int b){ // 최소공약수 
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
    
    int getLCM(int a, int b){ // 최소공배수
        return a * (b / getGCD(a, b));
    }
}