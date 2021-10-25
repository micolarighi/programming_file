def masak(waktu):
    print("Memproses indomie dalam waktu", waktu, "Menit")
    print("Indomie selesai dibuat")
    print("Selamat Makan", nama)


# mengambil input nama
nama = input("Masukkan nama anda : ")

# mengambil input bumbu
bumbu = input("Masukkan bumbu : ")
print("Bumbu", bumbu, "Sudah dimasukkan")
#  Bumbu + yang ada di dalam variable bumbu + Sudah dimasukkan

# perulangan
while True:
    print("Apa yang ingin anda lakukan berikutnya ? ")
    command = input("Masukkan perintah [Masak Air, Masukkan Mie] : ").lower()
    # conditional statement untuk mengecek langkah yang dimasukkan
    if command == "masak air":
        print("Sedang memasak air")
        waktu = input("Masukkan waktu memasak [5, 10, 20] : ")
        masak(waktu)
        break
    elif command == "makan":
        pass
        # aksi disini
    else:
        print("Langkah yang anda masukkan salah")
        continue
