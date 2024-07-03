class Solution {
    public String[] solution(String[] picture, int k) {
        // k 배 만큼 크기를 확장한다.
        String[] newPicture = new String[picture.length * k]; 
        
        // newPicture 의 각 요소를 picture 를 이용해 확장
        for(int i=0; i<picture.length; i++){
            StringBuilder sb = new StringBuilder();
            for(char c : picture[i].toCharArray()){
                for(int j=0; j<k; j++)
                    sb.append(c);   
            }
            
            for(int j=0; j<k; j++)
                newPicture[(i*k)+j] = sb.toString();
        }
        
        
        return newPicture;
    }
}