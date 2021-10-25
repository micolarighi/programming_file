#include <iostream>
#include <string>
using namespace std;

int main() {
	string menu [] = {"Nasi Goreng", "Ayam Goreng", "Soto Ayam"};
	int harga [] = {10000, 20000, 12000};
	int selectedMenu;
	int bayar;

	cout << "==== McOnald ====" << endl;
	cout << "=== Daftar Menu ===" << endl;
	for (int i = 0; i < 3; i++) {
		cout <<  i + 1 << ". " << menu[i] << endl;
	}

	cout << "masukkan nomor menu yang anda inginkan : ";
	cin >> selectedMenu;

	cout << "anda memilih menu " << menu[selectedMenu - 1] << endl;
	cout << "total harga : " << harga[selectedMenu - 1] << endl;

	cout << "masukkan uang anda : ";
	cin >> bayar;

	cout << "anda memasukkan uang : " << bayar << endl;
	
	if (bayar < harga[selectedMenu]){
		cout << "uang anda kurang " << harga[selectedMenu - 1] - bayar << endl;
	} else {
		int kembali = bayar - harga[selectedMenu - 1];
		cout << "kembali anda : " << kembali << endl;
	}
	

}
