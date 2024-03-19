import random as ra
n=int(input())
i=0
cout=0
while i < n:
      k=ra.randint(1,100)
      k1=ra.randint(1,100)
      print(k,"+",k1)
      i+=1
      vk=int(input())
      if(vk==k+k1):
          cout+=1;     
if(cout==n):
    print("you win")
   
else:
    print("you lost")
print("your score", cout*100//n,"out of ",n)