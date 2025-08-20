#include <iostream>
#include <algorithm>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  string a = "", b = "";
  cin >> a;
  cin >> b;

  transform(a.begin(), a.end(), a.begin(), ::tolower);
  transform(b.begin(), b.end(), b.begin(), ::tolower);

  if(string(a) > string(b)) {
    cout << 1 << endl;
  } else if(string(b) > string(a)) {
    cout << -1 << endl;
  } else {
    cout << 0 << endl;
  }
}