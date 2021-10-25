#include <iostream>
using namespace std;

int main () {
    int input;
    cout << "Masukkan umur anda : ";
    cin >> input;
    if (input < 18) {
        cout << "anda masih dibawah umur" << endl;
    } else if (input > 50){
	    cout << "anda terlalu tua" << endl;
    }else {
        cout << "anda boleh masuk" << endl;
    }
}
