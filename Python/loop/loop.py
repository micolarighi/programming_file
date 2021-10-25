baris = int(input("masukan baris : "))
kolom = int(input("masukan kolom : "))
simbol = input('masukan simbol : ')

for i in range(baris):
    print("\n")
    for i in range(kolom):
        print(simbol, end="")
