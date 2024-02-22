//alphabet[] = {'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' , 'l' , 'm' , 'n' , 'o' , 'p' , 'q' , 'r' , 's' , 't' , 'u' , 'v' , 'w', 'x' , 'y' , 'z'}
/*1
#include <iostream>
using namespace std;
int main() {
    string alphabet = "abcdefghijklmnopqrstuvwxyz";
    int ans[28] = {0};
    string s;
    cin >> s;
    for (int j = 0; j < 27; j++) {
        for (int i = 0; i < s.length(); i++) {
            if (alphabet[j] == s[i]) {
                ans[j] = i;
                break;
            }
            else {
                ans[j] = -1;
            }
        }
    }
    for (int i = 0; i < 26; i++) {
        cout << ans[i] << ' ';
    }
    cout << '\n';
}
*/

/*2
#include <iostream>
using namespace std;
int main() {
    int t , n;
    string s;
    cin >> t;
    for (int i = 0; i < t; i++) {
        cin >> n >> s;
        for (int j = 0; j < s.length(); j++) {
            for (int k = 0; k < n; k++) {
                cout << s[j];
            }
        }
        cout << '\n';
    }
}
*/

/*3
#include <iostream>
#include <string>
using namespace std;
int main() {
    int n = 0;
    string s;
    getline(cin , s);
    for (int i = 0; i < s.length(); i++) {
        if (s[i] == ' ') {
            n += 1;
        }
    }
    if (s[0] == ' ') {
        n -= 1;
    }
    if (s[s.length() - 1] == ' ') {
        n -= 1;
    }
    cout << n + 1 << '\n';
}
*/

/*4
#include <iostream>
#include <string>
using namespace std;
int main() {
    string a , b;
    cin >> a >> b;

    int a1 = a[0];
    a[0] = a[2];
    a[2] = a1;

    int b1 = b[0];
    b[0] = b[2];
    b[2] = b1;

    int na = stoi(a);
    int nb = stoi(b);

    if (a > b) {
        cout << a << '\n';
    }
    else {
        cout << b << '\n';
    }
}
*/

/*5
#include <iostream>
using namespace std;
int main() {
    int sum = 0;
    string s;
    cin >> s;
    for (int i = 0; i < s.length(); i++) {
        if (s[i] == 'A' || s[i] == 'B' || s[i] == 'C') {
            sum += 3;
        }
        else if (s[i] == 'D' || s[i] == 'E' || s[i] == 'F') {
            sum += 4;
        }
        else if (s[i] == 'G' || s[i] == 'H' || s[i] == 'I') {
            sum += 5;
        }
        else if (s[i] == 'J' || s[i] == 'K' || s[i] == 'L') {
            sum += 6;
        }
        else if (s[i] == 'M' || s[i] == 'N' || s[i] == 'O') {
            sum += 7;
        }
        else if (s[i] == 'P' || s[i] == 'Q' || s[i] == 'R' || s[i] == 'S') {
            sum += 8;
        }
        else if (s[i] == 'T' || s[i] == 'U' || s[i] == 'V') {
            sum += 9;
        }
        else if (s[i] == 'W' || s[i] == 'X' || s[i] == 'Y' || s[i] == 'Z') {
            sum += 10;
        }
    }
    cout << sum << '\n';
}
*/
