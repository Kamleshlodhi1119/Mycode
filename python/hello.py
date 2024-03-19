l =[1,4,4,5,6,7,8]
l1=[1,2,3,4,5,6,7,8,9];
for i in range(len(l)):
    k=l[i]
    if k  in l1:
        l1.remove(k)
print(l1)
    
