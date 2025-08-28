#include <iostream>
using namespace std;

int main() {
  int n = 0;
  cin >> n;

  string codeforces = "codeforces";

  for(int i = 0; i < n; i++) {
    char ch;
    cin >> ch;
    int counter = 0;

    for(int j = 0; j < codeforces.size(); i++) {
      if(ch == codeforces[j]) {
        counter++;
      }
    }

    if(counter >= 1) {
      cout << "YES" << endl;
    } else {
      cout << "NO" << endl;
    }
  }
}