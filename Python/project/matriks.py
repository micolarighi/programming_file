m1 = [10 , 2 , 3]
m2 = [1, 2, 6]
m3 = [2, 4, 5]

n1 = [4, -5, -2]
n2 = [0, 1, 5]
n3 = [0, 0, -2]

result1 = []
result2 = []
result3 = []

for i in range(len(m1)) :
    res1 = m1[i] + n1[i]
    res2 = m2[i] + n2[i]
    res3 = m3[i] + n3[i]
    
    result1.append(res1)
    result2.append(res2)
    result3.append(res3)

print(result1)
print(result2)
print(result3)