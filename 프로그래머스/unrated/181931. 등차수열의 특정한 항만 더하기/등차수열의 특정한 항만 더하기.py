def solution(a, d, included):
    answer = 0 
    sequence = list(0 for i in  range(len(included)))
    
    for idx in range(len(included)) :
        
        sequence[idx] = a + (d*idx)
        
        if included[idx] == True : 
            answer += sequence[idx]
            
    return answer

