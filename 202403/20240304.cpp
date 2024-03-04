/*1
#include <iostream>
using namespace std;
int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int m , n , array[10001] = {0} , sum = 0 , min = 10001;
    cin >> m >> n;
    for (int i = m; i <= n; i++) {
        for (int j = 2; j < i; j++) {
            if (i % j != 0) {
                array[i] = 1;
            }
            else {
                array[i] = 0;
                break;
            }
        }
    }

    if (m <= 2 && n >= 2) {
        sum += 2;
        min = 2;
    }

    for (int i = 3; i < 10001; i++) {
        if (array[i] != 0) {
            sum += i;
            if (min >= i) {
                min = i;
            }
        }
    }

    if (sum == 0) {
        cout << -1 << '\n';
    }
    else {
        cout << sum << '\n' << min << '\n';
    }
}
*/

/*2
#include <iostream>
using namespace std;
int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    cin >> n;
    for (int i = 2; i <= n; i++) {
        if (n == 1) {
            break;
        }
        else {
            while (1) {
                if (n % i != 0) {
                    break;
                }
                else {
                    cout << i << '\n';
                    n /= i;
                }
            }
        }
    }
}
*/

/*3
#include <iostream>
using namespace std;
int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a , b;
    cin >> a >> b;
    cout << a * b << endl;
}
*/

/*4
#include <iostream>
using namespace std;
int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int x, y, w, h;
    cin >> x >> y >> w >> h;
    int min1 = w - x , min2 = x , min3 = h - y, min4 = y, min_x , min_y;
    if (min1 >= min2) {
        min_x = min2;
    }
    else {
        min_x = min1;
    }

    if (min3 >= min4) {
        min_y = min4;
    }
    else {
        min_y = min3;
    }

    if (min_x >= min_y) {
        cout << min_y << '\n';
    }
    else {
        cout << min_x << '\n';
    }
}
*/

/*5

*/
#include <iostream>
using namespace std;
int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int x , y , array[1001] = {0};
    for (int i = 0; i < 3; i++) {
        cin >> x >> y;
        array[x] += 1;
        array[y] += 1;
    }
    for (int i = 1; i < 1001; i++) {
        if (array[i] == 1) {
            cout << i;
        }
    }
    cout << '\n';
}