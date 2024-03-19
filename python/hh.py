"""num=10
num2=10.0
ans =num*num2
print(int(ans))
n=int(input())
x=int(input())
print(n//  x)
print(n)
"""
# lambda fuction sqaur = lambda n:n*n    
"""
# map function
x="1 2  334 4"
l1=list(map(int,x.split()))
print(l1)
"""
""" 
 # the lambda function is use 
def sqaur(n):
    return n*n""" """
sqaur = lambda n:n*n    
tem=list(map(lambda n:n*n,l1))
print(tem)
name=[ " kamlesh","vineeth","lodhi"]
upper=lambda n:n.upper()
l2=list(map(upper,name))
print(l2)
""" """
n=[1,2,"a"]
l=[]

for i in n:
    if(str(i).isdigit()== True):
        l.append(i*i)
    else:
        l.append(0)
print(l)
""""""
n=[1,2,"a"]
l=[]
for i in n:
  k= l.append(i*i) if(str(i).isdigit()== True) else l.append(0l
   
print(k)
""""""
l=[1,2,"a",9,'kamlsh']
temp=[n*n*n for n in l if str(n).isdigit()==True]
print(temp)"""
n=int(input())
n2=int(input())
l=[i for i in range(n,n2+1) if i%2==0]
print(l)
print("hellopyt")


























