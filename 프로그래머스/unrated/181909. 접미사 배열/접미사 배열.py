def solution(my_string):
    answer = []
    
    #for i in reversed(range(len(my_string))):
    #    answer.append(my_string[i:len(my_string)])
    for i in range(len(my_string)):
        answer.append(my_string[i:])
    
    return sorted(answer)  
    