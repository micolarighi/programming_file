username = ["micola", "dafin", "ajizul", "gree", "husein", "ihsan", "farhan",
            "sapi", "alfi", "ani", "lucky", "bilah", "bila", "tresna", "admin", "megawati", "pintu"]


def daftar():
    username = input("Masukkan username : ")


user = input("Masukan username anda : ")
valid = False
for index in range(len(username)):
    if user == username[index]:
        valid = True
        break
    else:
        valid = False

if valid:
    print("login berhasil, selamat datang " + username[index])
elif not valid:
    print("username anda tidak terdafdar di database")
