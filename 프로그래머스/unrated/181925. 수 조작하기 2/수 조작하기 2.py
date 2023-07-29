def solution(numLog):
    answer = ''
    
    for idx in range(len(numLog) -1):
        if (numLog[idx+1] - numLog[idx]) == 1:
            answer += 'w'
        if (numLog[idx+1] - numLog[idx]) == -1:
            answer += 's'
        if (numLog[idx+1] - numLog[idx]) == 10:
            answer += 'd'
        if (numLog[idx+1] - numLog[idx]) == -10:
            answer += 'a'

    return answer