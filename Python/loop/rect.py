index = 20
index2 = 0
for i in range(index):
    print()
    if index > 10:
        index2 += 1
    else:
        index2 -= 1
    index -= 1

    for i in range(index2):
        print("*", end=" ")
    if index == 10:
        index2 = 10
