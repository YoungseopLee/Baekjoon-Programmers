import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        int[] answer = IntStream.range(1, n+1)
            .filter(i->i%2==1) // 홀수만 필터링
            .toArray();
        

        return answer;
    }
}