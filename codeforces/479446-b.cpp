#include <iostream>
#include <iomanip>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  cout << fixed << setprecision(9);

  int n; cin >> n;
  int64_t sum = 0, count = 0;

  for(int i = 0; i < n; i++) {
    int c, x;
    cin >> c >> x;

    if(c == '+') {
      sum += x;
      count++;
    } else if(c == '-') {
      count--;
      sum -= x;
    }

    long double average = sum / count;
    cout << (count == 0 ? 0 : average) << "\n";
  }
}