/*1
#include <iostream>
using namespace std;
int main() {
    int a , b , c , d , e , f;
    cin >> a >> b >> c >> d >> e >> f;
    cout << 1 - a << ' ' << 1 - b << ' ' << 2 - c << ' ' << 2 - d << ' ' << 2 - e << ' ' << 8 - f << '\n';
}
*/

/*2
#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++) {
        for (int k = n - i; k > 0; k--) {
            cout << ' ';
        }
        for (int j = 1; j <= 2*i - 1; j++) {
            cout << '*';
        }
        cout << '\n';
    }
    for (int p = 1; p < n; p++) {
        for (int m = 0; m < p; m++) {
            cout << ' ';
        }
        for (int t = 2*n - 2*p - 1; t >= 1; t--) {
            cout << '*';
        }
        cout << '\n';
    }
}
*/

/*3
#include <iostream>
using namespace std;
int main() {
    int a;
    string s;
    cin >> s;
    string ans = s;
    for (int i = 0; i < (s.length() / 2); i++) {
        a = s[i];
        s[i] = s[s.length() - 1 - i];
        s[s.length() - 1 - i] = a;
    }
    if (s == ans) {
        cout << 1 << '\n';
    }
    else {
        cout << 0 << '\n';
    }
}
*/
