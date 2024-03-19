import random as r
import string as s
q=int(input())
h=r.randint(1,q//3)
h1=r.randint(h,q//3)
h2= q-(h+h1)
a=list(s.ascii_letters)
num=list(s.digits)
sy=list(s.punctuation)
r.shuffle(a)
r.shuffle(num)
r.shuffle(sy)
password=a[0:h]+num[0:h1]+sy[0:h2]
password=("").join(password) 
print(password)
print(h,h1,h2)