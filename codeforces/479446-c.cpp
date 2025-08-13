#include <iostream>
using namespace std;

int main() {
  int n; cin >> n;
  long long currT = 0;

  for(int i = 0; i < n; i++) {
    int t;
    int d;
    cin >> t >> d;

    if(t >= currT) {
      currT = t;
    }
    currT += d;
  }

  cout << currT << endl;
}