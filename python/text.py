"""y= int(input())
e=int(input())
for i in range(y,e+1):
    if(i%4==-0):
     print(i)"""
a=input()
n3="ok"
if(a=='A'):    
    n=int(input())
    n2=int(input())
    while(n3!="Stop"):
       n3=input()
       if(n3!="stop"):
        print(n+n2)
elif(a=='S'): 
    n=int(input())
    n2=int(input()) 
    n3=input()
    if(n3!="stop"):
        if(n>n2):
         print(n-n2)
        else:
            print(n2-n)
elif(a=='D'):
    n=int(input())
    n2=int(input())
    n3=input()
    if(n3!="stop"):
     print(n//n2)
elif(a=='M'):
    n=int(input())
    n2=int(input())
    n3=input()
    if(n3!="stop"):
     print(n*n2)
else:
    print("bad opration")
    