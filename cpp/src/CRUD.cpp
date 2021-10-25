#include <iostream>
#include <string>

using namespace std;

int get_option()
{
  int input;

  cout << "PROGRAM CRUD SIMPEL" << endl;
  cout << "==========================" << endl;
  cout << "1. Tambah data Hero" << endl;
  cout << "2. Lihat data Hero" << endl;
  cout << "3. Update data Hero" << endl;
  cout << "4. Hapus data Hero" << endl;
  cout << "5. Keluar dari program" << endl;
  cout << "Pilih opsi menu [1-5] : ";
  cin >> input;
  return input;
}

int main(int argc, char const *argv[])
{
  int selectedOption = get_option();
  char is_continue;
  enum option
  {
    CREATE = 1,
    READ,
    UPDATE,
    DELETE,
    FINISH
  };

  while (selectedOption != FINISH)
  {
    switch (selectedOption)
    {
    case CREATE:
      cout << "Create" << endl;
      break;
    case READ:
      cout << "Read" << endl;
      break;
    case UPDATE:
      cout << "Update" << endl;
      break;
    case DELETE:
      cout << "Delete" << endl;
      break;
    case FINISH:
      cout << "Finish" << endl;
      break;
    default:
      break;
    }
  label_continue:

    cout << "lanjutkan? [y/n]" << endl;
    cin >> is_continue;

    if (is_continue == 'y' | is_continue == 'Y')
    {
      selectedOption = get_option();
    }
    else if (is_continue == 'n' | is_continue == 'N')
    {
      break;
    }
    else
    {
      goto label_continue;
    }
  }
  cin.get();
  return 0;
}
