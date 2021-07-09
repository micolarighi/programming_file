keranjangBelanja = []
run = True
saldo = 10000000
while run:
    print('\n=== Selamat Datang Di Program Simulasi CHECKOUT TOKO ONLINE===\n')
    print("Monitor --> 1.000.000")
    print("Laptop --> 5.000.000")
    print("Iphone --> 12.000.000")
    inputNama = input('Masukkan nama barang : ')
    inputKuantitas = int(input('Masukkan jumlah barang : '))
    inputCommand = input('Apakah anda ingin lanjut menambahkan barang? Y/N : ')
    for i in range(inputKuantitas):
        keranjangBelanja.append(inputNama)
    if inputCommand == "Y" or inputCommand == "y":
        run = True
    elif inputCommand == "N" or inputCommand == "n":
        run = False

    for i in range(len(keranjangBelanja)):
        if keranjangBelanja[i] == "monitor":
            saldo -= 1000000
        elif keranjangBelanja[i] == "laptop":
            saldo -= 5000000
        elif keranjangBelanja[i] == "iphone":
            saldo -= 12000000

    print(keranjangBelanja)

    inputConfirm = input(
        'Apakah anda ingin membeli semua produk di Keranjang Belanja Anda? Y/N : ')

    if inputConfirm == "Y" or inputConfirm == 'y':
        if saldo >= 0:
            continue
        elif saldo <= 0:
            print('Saldo anda tidak mencukupi, pembelian dibatalkan')
            saldo = 10000000

print('Sisa saldo anda adalah', saldo)
