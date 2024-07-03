import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {

        int row = arr.length;
        int col = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].length > col)
                col = arr[i].length;
        }
        
        int standard = Math.max(row, col);
        int [][] newArr = new int[standard][standard];
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++)
                newArr[i][j] = arr[i][j];
        }
        
        return newArr;
    }
}