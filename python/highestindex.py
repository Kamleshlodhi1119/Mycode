arr=[1,2,5,4,5,6,3,1,1,7]
n=int(input())
arr2=[]
for i in range(n) :
 arr2.append(i+1)

list1=[]
index =0
for i in range(len(arr2)) :
    for j in range(len(arr)-1) :
        if( arr2[i]==arr[j]):
         list1.append(j)
         break
list1.sort()
if(len(list1)==len(arr2)):
 print(list1[len(list1)-1]) 
else : 
    print("not match","-1")
 