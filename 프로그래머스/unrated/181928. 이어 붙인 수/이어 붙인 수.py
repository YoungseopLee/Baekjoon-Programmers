def solution(num_list):
    answer = 0
    even = ''
    odd = ''

    for idx in range(len(num_list)):
        if num_list[idx]%2==0 :
            even += str(num_list[idx])
        if num_list[idx]%2==1 :
            odd += str(num_list[idx])
    
    answer = int(even) + int(odd)
    return answer