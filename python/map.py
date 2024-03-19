#MAP
#num=input()
def sqr(n):
    n=int(n)
    return int(n*n)
num1=list(map(sqr,input().split()))
print (num1,type(num1))
 