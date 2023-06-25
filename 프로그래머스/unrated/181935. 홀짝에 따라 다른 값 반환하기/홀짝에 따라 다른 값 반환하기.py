def solution(n):
    
    answer = 0
    
    if (n%2) == 1 :
        for i in range(0, n):
            if (i%2) == 1 :
                answer += i     
        answer += n
    else :
        for i in range(0, n):
            if(i%2) == 0 :
                answer += i*i
        answer += n*n
    
    return answer