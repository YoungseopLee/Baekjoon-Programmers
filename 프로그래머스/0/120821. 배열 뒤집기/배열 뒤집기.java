class Solution {
    public int[] solution(int[] num_list) {
        int end = num_list.length-1;
        int temp = 0;
        
        for(int i=0; i<end/2; i++){
            temp = num_list[i];
            num_list[i] = num_list[end-i];
            num_list[end-i] = temp; 
        }
        
        return num_list;
    }
}