vector<char> vowels = {'a', 'e', 'i', 'o', 'u'};
  unordered_map<char, int> countChars;
  int maxVowel = 0, maxCons = 0;

  for(int i = 0; i < s.size(); i++) {
      countChars[s[i]]++;
  }

  for(const auto[key, val] : countChars) {
    if(find(vowels.begin(), vowels.end(), key) != vowels.end()) {
      if(val > maxVowel) {
        maxVowel = val;
      } else {
        if(val > maxCons) {
          maxCons = val;
        }
      }
    }
  }

  return maxVowel + maxCons;