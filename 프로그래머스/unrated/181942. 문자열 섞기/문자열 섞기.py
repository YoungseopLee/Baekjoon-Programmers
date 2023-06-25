def solution(str1, str2):
    answer = ""
    
    str1 = list(str1)
    str2 = list(str2)
    
    for i in range(len(str1)):
        answer += str1[i] + str2[i]
        
    return answer