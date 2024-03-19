"""lst1 = [23, 15, 2, 14, 14, 16, 20 ,52]
lst2 = [2, 48, 15, 12, 26, 32, 47, 54]
print( list(set(lst1) | set(lst2)))""""""
l=[12,54,8,5,9,10]
l1=[1,4,5,6,78,88,215]
s=set(l+l1)
print(s.pop())
print(s)""" 
a = [1,2,3,4,5]
b = [1,3,5,6]
intersection = list(set(a) & set(b))
union = list(set(a) | set(b))
non_intersection = intersection - union
[2, 4, 6]