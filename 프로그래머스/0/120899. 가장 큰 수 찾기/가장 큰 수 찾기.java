class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }
        
        return new int[] {max, maxIndex};
    }
}