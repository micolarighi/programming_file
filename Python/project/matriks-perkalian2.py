m = [[0, 1, 2], [-4, 2 ,1]]

n = [[-2, 0, 1], [0, 3, 0], [1, 4, 6]]

res1 = []
res2 = []
res3 = []
result1 = []
result2 = []
result3 = []


for i in range(3) :
    for j in range(3):
        res1.append(m[0][j] * n[j][i])

for i in range(3) :
    for j in range(3):
        res2.append(m[1][j] * n[j][i])


result1.append(res1[0] + res1[1] + res1[2])
result1.append(res1[3] + res1[4] + res1[5])
result1.append(res1[6] + res1[7] + res1[8])

result2.append(res2[0] + res2[1] + res2[2])
result2.append(res2[3] + res2[4] + res2[5])
result2.append(res2[6] + res2[7] + res2[8])


print(result1)
print(result2)
