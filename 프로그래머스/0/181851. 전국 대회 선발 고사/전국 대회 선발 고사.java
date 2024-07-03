import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        // 입출이 용이하도록 Map 으로 변환 
        List<Integer> rankList = Arrays.stream(rank)
            .boxed().collect(Collectors.toList());
        
        Map<Integer, Integer> rankMap = new HashMap<>();
        for(int i=0; i<rankList.size(); i++)
            rankMap.put(rankList.get(i), i);
        
        // boolean[] 은 바로 변환 안됨; 
        List<Boolean> attendanceList = new ArrayList<>();
        for(boolean b : attendance)
            attendanceList.add(b);
        
        // false 인 학생은 컷
        for(int i=0; i<attendanceList.size(); i++){
            if(attendanceList.get(i).equals(false)){
                attendanceList.remove(i);
                rankList.remove(i);
                i--;
            }
        }
        
        Collections.sort(rankList);
        
        int a = rankMap.get(rankList.get(0)) * 10000;
        int b = rankMap.get(rankList.get(1)) * 100;
        int c = rankMap.get(rankList.get(2));
        
        int answer = a+b+c;
        
        return answer;
    }
}