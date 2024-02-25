//시간복잡도 개념
/*1
#include <iostream>
using namespace std;
int main() {
    int a;
    cin >> a;
    cout << a << '\n' << 1 << '\n';
}
*/

/*2
#include <iostream>
using namespace std;
int main() {
    long a;
    cin >> a;
    cout << a * a << '\n' << 2 << '\n';
}
*/

/*3
#include <iostream>
using namespace std;
int main() {
    long int n , ans = 0;
    cin >> n;
    for (int i = 1; i < n; i++) {
        ans += i;
    }
    cout << ans << '\n' << 2 << '\n';
}
*/

/*4
#include <iostream>
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    long int n , mid = 0 , ans = 0;
    cin >> n;
    for (int i = 1; i < n - 1; i++) {
        mid += i;
    }
    for (int j = n - 2; j > 0; j--) {
        ans += mid;
        mid -= j;
    }
    cout << ans << '\n' << 3 << '\n';
}
*/

/*5
#include <iostream>
using namespace std;
int main() {
    long int a1 , a0 , c , n0 , ans;
    cin >> a1 >> a0 >> c >> n0;
    for (int i = 100; i >= n0; i--) {
        if (c*i >= a1 * i + a0) {
            ans = 1;
        }
        else {
            ans = 0;
            break;
        }
    }
    cout << ans << '\n';
}
*/
