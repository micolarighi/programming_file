# mencari nilai rata2
data = [20, 10, 12, 23, 25, 5, 6, 7, 8]

# ide : menjumlahkan semua elemen yang ada di array kemudian dibagi dengan jumlah data di array
result_mean = 0
for i in range(len(data)):
    result_mean = result_mean + data[i]

print(result_mean / 2)

# mencari nilai median
if len(data) % 2 == 0:
    result_median = data[(len(data) - 1)] + data[len(data) / 2]
    print(result_median / 2)
elif len(data) % 2 == 1:
    index = 0
    index = len(data) / 2
    result_median = data[round(index)]

    print(result_median)
