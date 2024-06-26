class Solution {
    public String solution(String myString, String pat) {
        
        String rPat = new StringBuilder(pat).reverse().toString();
        String rStr = new StringBuilder(myString).reverse().toString();
        rStr = rStr.substring(rStr.indexOf(rPat.toString()));       
        
        StringBuilder answer = new StringBuilder(rStr).reverse();
    
          
            
        return answer.toString();
    }
}