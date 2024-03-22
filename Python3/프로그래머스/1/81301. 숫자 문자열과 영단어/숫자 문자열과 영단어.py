dic = {"zero":"0", "one":"1", "two":"2", "three":"3", "four":"4", "five":"5", "six":"6", "seven":"7", "eight":"8", "nine":"9"}

def solution(s):
    answer1 = 0
    answer2 = s
    
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
    
    answer1 = int(str1)
    
    for key, value in dic.items():
        answer2 = answer2.replace(key, value)
    
    return int(answer2)