import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
        Arrays.sort(array);
        
        int idx = array.length/2;
        int answer = array[idx];
        
        return answer;
    }
}