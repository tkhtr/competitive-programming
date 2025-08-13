#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>
using namespace std;

vector<string> letterCombinations(string digits) {
  vector<string> letters = {"abc", "def",  "ghi", "jkl",
                                  "mno", "pqrs", "tuv", "wxyz"};
  unordered_map<int, string> keyboard;
  vector<string> digits_to_letters;
  vector<string> result;

  if(digits.empty()) {
    return result;
  }

  int counter = 0;
  for (int i = 2; i <= 9; i++) {
    keyboard[i] = letters[counter++];
  }

  for (int i = 0; i < digits.size(); i++) {
    int key = digits[i] - '0';
    if (keyboard.find(key) != keyboard.end()) {
      digits_to_letters.push_back(keyboard[key]);
    }
  }

  result.push_back("");
  for (int i = 0; i < digits_to_letters.size(); i++) {
    string comb = digits_to_letters[i];
    vector<string> next;
    next.reserve(result.size() * comb.size());
    for(const string& prefix : result) {
      for(char ch : comb) {
        next.push_back(prefix + ch);
      }
    }
    result.swap(next);
  }

  return result;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  
  vector<string> result = letterCombinations("23");

  for(const string& c : result) {
    cout << c << " ";
  }
}