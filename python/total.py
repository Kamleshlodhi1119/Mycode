s=" True  False  True"
if (s[0]=="T"):
        print(1)
if (s[0]=="F"):
        print(1)
for i in range(len(s)):
    if (s[i]==' '  and s[i+1]=="T"):
        print(1)
    elif (s[i]==' '  and s[i+1]=="F"):                   
        print (0)