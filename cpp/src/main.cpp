#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
  string nama;
  string password;
  cout << "masukkan nama anda : ";
  cin >> nama;
  cout << "masukkan password anda : ";
  cin >> password;
  if (password == "micola") {
    cout << "login berhasil, selamat datang " + nama << endl;
  }
  else {
    cout << "password yang anda masukkan salah" << endl;
  }
  
  return 0;
}

