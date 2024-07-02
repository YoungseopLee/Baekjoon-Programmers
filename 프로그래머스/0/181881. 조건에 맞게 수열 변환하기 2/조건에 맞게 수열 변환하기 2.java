import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int x = 0;
        boolean arraysEqual = false;
        
        while(!arraysEqual) {
            int[] previousArr = arr.clone(); // 이전 배열상태 복제
            
            for(int i=0; i<arr.length; i++){
                if(arr[i] >= 50 && arr[i]%2 == 0)
                    arr[i] = arr[i]/2;
                else if(arr[i] < 50 && arr[i]%2 == 1)
                    arr[i] = (arr[i]*2) + 1;
            }
            
            x++;
            arraysEqual = Arrays.equals(arr, previousArr);
        }
        
        
        answer = x-1;

        return answer;
    }
}