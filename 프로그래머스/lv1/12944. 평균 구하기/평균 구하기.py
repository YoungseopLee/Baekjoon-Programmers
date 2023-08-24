def solution(arr):
  
    num = 0
    
    for i in range(len(arr)):
        num += arr[i]
    
    return  num/len(arr)