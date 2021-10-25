#include <iostream>
#include<cstdlib>
#include <fstream>

using namespace std;

int main(int argc, char const *argv[])
{
  int max;
  max = 20;

  ofstream data;
  srand(time(0));
  data.open("data.txt", ios::app);
  data << rand()%max;
  data.close();
  return 0;
}
