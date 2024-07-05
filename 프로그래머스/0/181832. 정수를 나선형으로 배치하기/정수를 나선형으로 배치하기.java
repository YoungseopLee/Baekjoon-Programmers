import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[][] solution(int n) {
        
        int[][] answer = new int[n][n];
        
        int top = 0; 
        int bottom = n-1;
        int left = 0; 
        int right = n-1;
        
        int num = 1;
        
        while(num <= n*n){
            
            // left -> right
            for(int i=left; i <= right && num <= n*n; i++){ 
                answer[top][i] = num++;
            } 
            
            top++; 
            
            // right -> bottom
            for(int i=top; i <= bottom && num <= n*n; i++){ 
                answer[i][right] = num++;
            } 
            
            right--; 
            
            // right -> left
            for(int i=right; i >= left && num <= n*n; i--){ 
                answer[bottom][i] = num++;
            }
            
            bottom--;
            
            // left -> top
            for(int i=bottom; i >= top && num <= n*n; i--){ 
                answer[i][left] = num++;
            } 
        
            left++;
            
        }
        
        return answer;
    }
}