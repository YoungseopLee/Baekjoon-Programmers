def solution(num_list):

    a = 0
    b = 0
    
    for i in range(0, len(num_list), 2):
        a += num_list[i]
        
    for j in range(1, len(num_list), 2):
        b += num_list[j]
        
    if a>b : return a
    else: return b
    