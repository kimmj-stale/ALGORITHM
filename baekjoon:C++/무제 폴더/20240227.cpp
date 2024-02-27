#include <iostream>
using namespace std;
int main(void) {
    int array[9][9];
    int ans_i , ans_j , max_num = 0;

    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            cin >> array[i][j];
        }
    }
    
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if (array[i][j] >= max_num) {
                max_num = array[i][j];
                ans_i = i;
                ans_j = j;
            }
        }
    }

    cout << max_num << '\n' << ans_i + 1 << ' ' << ans_j + 1;
}
