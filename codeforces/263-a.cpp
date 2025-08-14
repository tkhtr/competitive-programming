#include <iostream>
#include <vector>
#include <iomanip>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  vector<vector<int> > matrix(5, vector<int>(5));
  int one_row = 0, one_col = 0;

  for(int i = 0; i < 5; i++) {
    for(int j = 0; j < 5; j++) {
      cin >> matrix[i][j];
      if(matrix[i][j] == 1) {
        one_row = i;
        one_col = j;
      }
    }
  }
  
  int moves = abs(one_row - 2) + abs(one_col - 2);

  cout << moves << endl;
}