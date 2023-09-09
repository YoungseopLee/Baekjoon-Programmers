def solution(num_list):
    answer = []
    cnt = 0
    
    for idx in range(len(num_list)):
        if num_list[idx]%2 ==0 :
            cnt += 1
    
    answer.append(cnt)
    answer.append(len(num_list)-cnt)
    
    return answer