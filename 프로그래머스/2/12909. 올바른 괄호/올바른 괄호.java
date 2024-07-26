import java.util.Stack;

class Solution {
    boolean solution(String s) {
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        Stack<Character> cStack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c=='('){
                cStack.push(c);
            }else if(c==')'){
                if(cStack.isEmpty() || cStack.peek() != '('){
                    return false;
                }
                cStack.pop();
            }
        }
  
        // 스택이 비어있으면 짝이 맞는 것
        return cStack.isEmpty(); 
    }
}