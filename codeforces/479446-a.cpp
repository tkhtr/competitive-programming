#include <iostream>
using namespace std;

int main() {
  int n;
  cin >> n;
  long long balance = 0, min_balance = 0;

  for(int i = 0, a; i < n; i++) {
    cin >> a;
    balance += a;

    if(balance < min_balance) {
      min_balance = balance;
    }
  }

  cout << -min_balance << endl;
}