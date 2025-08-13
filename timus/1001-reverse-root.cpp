#include <iostream>
#include <iomanip>
#include <vector>
#include <cmath>
using namespace std;

int main() {
  vector<unsigned long long> nums;
  unsigned long long x;

  while(cin >> x) {
    nums.push_back(x);
  }

  for(int i = nums.size() - 1; i >= 0; --i) {
    cout << setprecision(4) << fixed << sqrt(nums[i]) << endl;
  }
}