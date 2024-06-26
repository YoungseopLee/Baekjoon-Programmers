class Solution {
    public String solution(String my_string, int s, int e) {
        
        String[] str = my_string.split("");
        String temp = "";
        
        for(int i=0; i<=(e-s)/2; i++){
            temp = str[e-i];
            str[e-i] = str[s+i];
            str[s+i] = temp;
        }
        
        return String.join("", str);
    }
}