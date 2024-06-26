class Solution {
    public String solution(String my_string, int s, int e) {
        
        StringBuilder rsb = new StringBuilder(my_string.substring(s, e+1)).reverse();
        
        
        return my_string.substring(0, s) + rsb.toString() + my_string.substring(e+1); 
        
        
    }
}