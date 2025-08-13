#include <iostream>
#include <map>
#include <vector>
#include <algorithm>
using namespace std;

int maxFreqSum(string s) {
        unordered_map<char, int> count;
        int max_vow = 0, max_cons = 0;

        for(int i = 0; i < s.size(); i++) {
            count[s[i]]++;

            if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
                max_vow = max(max_vow, count[s[i]]);
            } else {
                max_cons = max(max_cons, count[s[i]]);
            }
        }
        
        return max_vow + max_cons;
    }

int main() {
  int result = maxFreqSum("successes");
  cout << result;
}