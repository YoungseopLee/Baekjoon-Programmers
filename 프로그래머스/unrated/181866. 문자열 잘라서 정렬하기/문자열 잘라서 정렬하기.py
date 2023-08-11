def solution(myString):
    
    answer = myString.split('x')
    
    return sorted(list(filter(None, answer)))
                  