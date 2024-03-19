"""class kamlesh:
 def _init_(self,nm,ag,db):
        self.name=nm
        self.age=ag
        self.dob=db         
def printdata(self):
    print("my name is : ",self.name)
    print("age is : ",  self.age)
    print("date of birth : ", self.dob)
s1=kamlesh()
s1.getdata("kamlesh","18","2003 12 15")
s1.printdata()
"l=[]
sc=int(input())
for i in range(sc):
    x=input()
    x1=int(input())
    x2=input()
    l.append(kamlesh(x,x1,x2))
for i in  range(sc):
    print(l[i].printdata())"""
class kamlesh:
     
    # init method or constructor
    def __init__(self, name,age,db):
        self.name = name
        self.age=age
        self.date=db

    # Sample Method
    def data(self):
        print('Hello, my name is', self.name)
        print('Hello, my age is', self.age)
        print('Hello, my age is', self.date)
 
p = kamlesh()
"""p.getd('kamlesh',18,12)
p.data()"""
l=[]
sc=int(input())
for i in range(sc):
    x=input()
    x1=int(input())
    x2=input()
    l.append(kamlesh(x,x1,x2))
for i in  range(sc):
    print(l[i].printdata())