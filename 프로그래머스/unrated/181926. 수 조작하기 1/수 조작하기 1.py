def solution(n, control):
    
    for idx in range(len(control)):
        if control[idx] == 'w' : 
            n += 1
        elif control[idx] == 's' :
            n -= 1
        elif control[idx] == 'd' :
            n += 10
        elif control[idx] == 'a' :
            n -= 10
    return n