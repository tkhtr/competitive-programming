#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

bool containsNearbyDuplicate(vector<int>& nums, int k) {
        unordered_map<int, int> map;

        for(int i = 0; i < nums.size(); i++) {
            if(map.find(nums[i]) != map.end()) {
                int j = map[nums[i]];

                if(nums[i] == nums[j] && abs(i - j) <= k) {
                    return true;
                }
            }
            map[nums[i]] = i;
        }
        return false;
    }


int main() {
  vector<int> arr = {1, 2, 3, 4, 5};
  int k = 3;
  int result = containsNearbyDuplicate(arr, k);
  cout << result << endl;
}