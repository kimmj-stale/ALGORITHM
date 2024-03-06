/*1
#include <iostream>
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n , m , a , sum = 0 , max = 0;
    cin >> n >> m;
    int array[n];
    for (int i = 0; i < n; i++) {
        cin >> a; 
        array[i] = a;
    }
    for (int i = (n - 1); i >= 2; i--) {
        for (int j = i - 1; j >= 1; j--) {
            for (int k = j - 1; k >= 0; k--) {
                sum = array[i] + array[j] + array[k];
                if (sum <= m) {
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
        }
    }
    cout << max << '\n';
}
*/