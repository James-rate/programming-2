def int_to_words(n):
    #Write your code here
    zero_nineteen=["zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen",
    "sixteen","seventeen","eighteen","nineteen"
    ]
    twenty_ninety=["twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"]
    if n<20:
        return zero_nineteen[n]
    elif n<100:
        ten=((n)//10)
        one=n%10
        if one==0:
            return twenty_ninety[ten-2]
        else:
            return twenty_ninety[ten-2]+" "+zero_nineteen[one]
    elif n<1000:
        hundred=n//100
        rest=n%100
        if rest==0:
            return zero_nineteen[hundred]+" hundred"
        else:
            return zero_nineteen[hundred]+" hundred and "+int_to_words(rest)



def int_to_roman(num):
    #Write your code here
    zero_nine=["I","II","III","IV","V","VI","VII","VIII","IX"]
    ten_ninty=["X","XX","XXX","XL","L","LX","LXX","LXXX","XC"]
    hundred=["C","CC","CCC","CD","D","DC","DCC","DCCC","CM"]
    if num<10:
        return zero_nine[num-1]
    elif num<100:
        ten=((num)//10)
        one=num%10
        if one==0:
            return ten_ninty[ten-1]
        else:
            return ten_ninty[ten-1]+zero_nine[one-1]
    else:
        hundreds=num//100
        rest=num%100
        if rest==0:
            return hundred[hundreds-1]
        else:
            return hundred[hundreds-1]+int_to_roman(rest)
if __name__ == '__main__':
    #Write your code here
    number= int(input("Number: "))
    while number!=-1:
        print(f"In words: " + int_to_words(number))
        print(f"In roman: " + int_to_roman(number))
        number = int(input("Number: "))
    print("Done")