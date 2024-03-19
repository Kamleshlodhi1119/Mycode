arr=[1,1,2,55,55,68,4]
arr2=[];
for i in range(len(arr)):
    k=arr[i]
    if k not in arr2:
        arr2.append(k)      
        v=arr.count(arr[i])
        print(arr[i],'-',v)

 
 
    
