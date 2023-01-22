import math

x = list(map(int, input().split()))
n = x[0]
m = x[1]
a = x[2]
print(((n+a-1)//a) * ((m+a-1)//a))