

class Solution {
    public int[] solution(String my_string) {
                
        int[] numArr = new int[52];
        
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnopqrstuvwxyz";
        
        for(int i=0; i<my_string.length(); i++){
            int count = counter(my_string, my_string.charAt(i));
            int target = alphabet.indexOf(my_string.charAt(i));
            
            numArr[target] = count;
            count = 0;
        }
        
        return numArr;
    }
    
    public static int counter(String str, char target){
        return (int) str.chars().filter(ch -> ch == target).count();
    }
}