/*1
#include <iostream>
using namespace std;
int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a , b , num = 0;
    cin >> a >> b;
    for (int i = 1; i <= a; i++) {
        if (a % i == 0) {
            num += 1;
            if (num == b) {
                cout << i;
            }
        }
    }
    if (num < b) {
        cout << 0;
    }
}
*/
