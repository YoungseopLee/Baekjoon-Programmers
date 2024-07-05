import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dices = {a, b, c, d};
        
        Arrays.sort(dices); 

        // 네 주사위의 값이 모두 같은 경우
        if (dices[0] == dices[3]) {
            return 1111 * dices[0];
        }
        
        // 세 주사위의 값이 같고 나머지 한 주사위의 값이 다른 경우
        if (dices[0] == dices[2] || dices[1] == dices[3]) {
            if (dices[0] == dices[2]) {
                return (int) Math.pow((10 * dices[0] + dices[3]), 2);
            } else {
                return (int) Math.pow((10 * dices[1] + dices[0]), 2);
            }
        }

        // 두 주사위의 값이 각각 같은 두 쌍인 경우
        if (dices[0] == dices[1] && dices[2] == dices[3]) {
            return (dices[0] + dices[2]) 
                * Math.abs(dices[0] - dices[2]);
        }

        // 두 주사위의 값이 같고 나머지 두 주사위의 값이 각각 다른 경우
        if (dices[0] == dices[1] && dices[2] != dices[3]) {
            return dices[2] * dices[3];
        }
        if (dices[1] == dices[2] && dices[0] != dices[3]) {
            return dices[0] * dices[3];
        }
        if (dices[2] == dices[3] && dices[0] != dices[1]) {
            return dices[0] * dices[1];
        }

        // 네 주사위의 값이 모두 다른 경우
        return dices[0];
    }
}