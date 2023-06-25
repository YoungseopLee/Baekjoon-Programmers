def solution(a, b):
    
    a = str(a)
    b = str(b)

    if int(a+b) > int(b+a) : 
        return int(''.join(a+b))
    elif int(a+b) < int(b+a) :
        return int(''.join(b+a))
    else :
        return int(''.join(a+b))
    