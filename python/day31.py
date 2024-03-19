"""# inheritance
class kam:
    def kam(self,k):
        self.one=k
    def print(self):
        print(self.one)
class vin(kam):
    def vin(k1):
        print(" hello")
ob1=vin()
ob1.vin()
ob1.kam(100)
ob1.print()

        """"""
class person:
    def __init__(self,n,a,c):
        self.name=n
        self.age=a
        self.city=c
    def print(self):
        print(self.name)
        print(self.age)
        print(self.city)
class student(person):
    def __init__(self,fee,n, a, c):
        self.kam=fee
        super().__init__(n, a, c)
        #we are calling the parent calss method
    def print1(self):
        print(self.kam)
s=student("kamlesh",18,"sagar",1000 )
s.print1()
s.print()

"""
class holiday:
    def __init__(self,name,dayR,Expen):
        self.n=name
        self.k=dayR
        self.E=Expen
    def view(self):
        print(self.n)
        print(self.k)
        print(self.E)
class Foreigenplace(holiday):
    def __init__(self,fees, kam,name, dayR, Expen):
        self.k3=kam
        self.l=fees
        super().__init__(name, dayR, Expen)
    def addfhplace(self):
        print(self.k3)
        print(self.l)
v=Foreigenplace(12,"kamlesh",5000,"yes","america")
v.addfhplace()
v.view()


        
     