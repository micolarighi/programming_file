import random
user_gender1 = None
user_gender2 = None


def calculate(nama1, nama2):
    loveMeter = 0
    if nama1 == "dhafin" and nama2 == "nabilla":
        loveMeter = 100
    elif nama1 == "rizky dhafin" and nama2 == "nabilla kurnia":
        loveMeter = 100
    elif nama1 == "muhammad rizky dhafin" and nama2 == "nabilla kurnia hapsari":
        loveMeter = 100
    return loveMeter


while True:
    while True:
        inputNama1 = input("Masukkan nama pertama : ").lower()
        input_gender1 = input("Masukkan Gender [L / P] : ").lower()

        input_nama2 = input("Masukkan nama kedua : ").lower()
        input_gender2 = input("Masukkan Gender [L / P] : ").lower()

        print(inputNama1[0])

        if input_gender1 == "l" and input_gender2 == "p" or input_gender1 == "p" and input_gender2 == "l":
            user_gender1 = input_gender1
            user_gender2 = input_gender2
            break
        else:
            print("Gender yang anda masukkan invalid")

    print(f"Meteran Cinta Antara {inputNama1} dan {input_nama2} adalah")
    print(calculate(inputNama1, input_nama2), "%")

    command = input(
        "Ketik huruf q untuk keluar, ketik apapun untuk membatalkan : ").lower()

    if command == "q":
        break
    else:
        print("Melanjutkan Program")
