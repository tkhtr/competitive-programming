#include <iostream>
using namespace std;

bool isPal(string s) {
  for(int i = 0; i < s.size() / 2; i++) {
    if(s[i] != s[s.size() - 1 - i]) {
      return false;
    }
  }
  return true;
}

int main() {
  int t;
  cin >> t;

  for(int i = 0; i < t; i++) {
    string s;
    cin >> s;

    for(int j = (int)s.size(); j >= 1; j--) {
      if(isPal(s.substr(0, j))) {
        cout << j << '\n';
        break;
      } 
    }
  }
}