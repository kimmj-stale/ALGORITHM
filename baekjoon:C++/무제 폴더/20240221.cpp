/*1
#include <iostream>
using namespace std;
int main() {
    int n , m , arr[101] = {0};
    cin >> n >> m;
    for (int l = 0; l < n; l++) {
        arr[l + 1] = l + 1;
    }
    for (int j = 0; j < m; j++) {
        int a , b , cst;
        cin >> a >> b;
        for (int i = 0; i <= ((b - a) / 2); i++) {
            cst = arr[a + i];
            arr[a + i] = arr[b - i];
            arr[b - i] = cst;
            }
        }
    for (int k = 1; k <= n; k++) {
        cout << arr[k] << ' ';
    }
    cout << '\n';
}
*/

/*2
#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    int n , arr[1001] = {0}; 
    double ans[1001] = {0};
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    int max_s = 0;
    double sum = 0;
    for (int j = 0; j < n; j++) {
        if (arr[j] > max_s) {
            max_s = arr[j];
        }
    }
    for (int k = 0; k < n; k++) {
        ans[k] = ((double) arr[k] / max_s) * 100;
        sum += ans[k];
    }
    cout << (double) sum/n << '\n';
}
*/

/*3
#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    string s;
    int i;
    cin >> s >> i;
    cout << s[i - 1] << '\n';
}
*/

/*4
#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    string s;
    cin >> s;
    cout << s.length() << '\n';
}
*/

/*5
#include <iostream>
using namespace std;
int main() {
    int t;
    cin >> t;
    string s;
    for (int i = 0; i < t; i++) {
        cin >> s;
        cout << s[0] << s[s.length() - 1] << '\n';
    }
}
*/

/*6
#include <iostream>
using namespace std;
int main() {
    char s;
    cin >> s;
    int ask = s;
    cout << ask << '\n';
}
*/

/*7

*/
#include <iostream>
using namespace std;
int main() {
    int n , sum = 0;
    char c[1001];
    cin >> n >> c;
    for (int i = 0; i < n; i++) {
        char ele = c[i];
        sum += (ele - '0');         //숫자의 경우 아스키 코드간의 차이 = 숫자간의 차이다
    }
    cout << sum << '\n';
}