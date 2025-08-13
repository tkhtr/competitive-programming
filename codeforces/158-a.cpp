#include <iostream>
#include <vector>
using namespace std;

int main() {
  int n = 0, k = 0;
  cin >> n >> k;
  vector<int> nums(n);

  for(int i = 0; i < n; i++) {
    cin >> nums[i];
  }

  int threshold = nums[k - 1];
  int counter = 0;

  for(int i = 0; i < n; i++) {
    if(nums[i] > 0 && nums[i] >= threshold) {
      counter++;
    }
  }

  cout << counter << endl;
}