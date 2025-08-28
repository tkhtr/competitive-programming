#include <iostream>
using namespace std;

int main() {
  string c;
  cin >> c;
  int n = c.length();
  int k = 7;

  for (int i = 0; i <= n - k; i++) {
    int counter = 0;
    for (int j = i; j <= i + k - 1; j++) {
      if (c[i] == c[j]) {
        counter++;
      }
    }
    if(counter == k) {
      cout << "YES";
      return 0;
    }
  }

  cout << "NO";
}