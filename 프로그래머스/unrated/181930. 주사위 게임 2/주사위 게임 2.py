def solution(a, b, c):
    answer = 0 
    
    # All number is diffrent
    if a!=b and b!= c and a!= c:
        answer = a+b+c
    ## 2 number is same 
    elif (a==b and a!=c and b!=c) or (a==c and a!=b and c!=b) or (b==c and b!=a and c!=a): 
        answer = (a+b+c)*((a*a)+(b*b)+(c*c))
    ### All number is same 
    elif a==b and b==c and a==c : 
        answer = (a+b+c)*((a*a)+(b*b)+(c*c))*((a*a*a)+(b*b*b)+(c*c*c))
    
    return answer