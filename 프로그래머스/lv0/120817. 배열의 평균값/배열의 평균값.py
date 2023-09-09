def solution(numbers):
    answer = 0
    
    for idx in range(len(numbers)):
        answer += numbers[idx]
        
    return answer/len(numbers)