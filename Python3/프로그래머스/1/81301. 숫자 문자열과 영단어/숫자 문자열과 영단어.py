def solution(s):
    answer = 0
    
    str1 = ""
    str2 = ""
    
    for c in s:
        if c.isdigit() :
            str1 += c 
        else : 
            str2 += c
            
            if str2 == "zero":
                str2 = ""
                str1 += "0"
            elif str2 == "one":
                str2 = ""
                str1 += "1"
            elif str2 == "two":
                str2 = ""
                str1 += "2"
            elif str2 == "three":
                str2 = ""
                str1 += "3"
            elif str2 == "four":
                str2 = ""
                str1 += "4"
            elif str2 == "five":
                str2 = ""
                str1 += "5"
            elif str2 == "six":
                str2 = ""
                str1 += "6"
            elif str2 == "seven":
                str2 = ""
                str1 += "7"
            elif str2 == "eight":
                str2 = ""
                str1 += "8"
            elif str2 == "nine":
                str2 = ""
                str1 += "9"
            
    return int(str1)