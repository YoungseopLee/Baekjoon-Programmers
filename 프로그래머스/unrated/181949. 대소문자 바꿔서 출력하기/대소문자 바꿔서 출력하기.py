str = list(input())

def convertAlphabet(str):
    for i in range(len(str)):
        if str[i] >= 'A' and str[i] <= 'Z':
            str[i] = chr(ord(str[i]) + 32)           
        elif str[i] >= 'a' and str[i] <= 'z': 
            str[i] = chr(ord(str[i]) - 32)
            
    return print(''.join(str))

convertAlphabet(str)
