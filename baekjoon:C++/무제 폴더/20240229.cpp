/*1
#include <iostream>
using namespace std;
int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a , b;
    cin >> a;
    for (int i = 0; i < a; i++) {
        int q = 0 , d = 0 , n = 0 , p = 0;
        cin >> b;
        for (int j = 0; j < 1001; j++) {
            if (b >= 25) {
                b -= 25;
                q += 1;
            }
            else if (b == 0) {
                break;
            }
            else {
                if (b >= 10) {
                    b -= 10;
                    d += 1;
                }
                else if (b >= 5) {
                    b -= 5;
                    n += 1;
                }
                else {
                    p = b;
                }
            }
        }
        cout << q << ' ' << d << ' ' << n << ' ' << p << '\n';
    }
}
*/
#include <iostream>
using namespace std;
int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a , b = 2 , k = 1;
    cin >> a;
    for (int i = 0; i < a; i++) {
        b += k;
        k *= 2;
        }
    
    int ans = b * b;
    cout << ans << '\n';
}
