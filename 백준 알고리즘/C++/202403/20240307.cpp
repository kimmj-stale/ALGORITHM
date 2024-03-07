/*1
#include <iostream>
using namespace std;
int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n , tmp , cnt = 0 , num = 1;
    cin >> n;
    tmp = n;
    while (tmp > 0) {
        tmp /= 10;
        cnt ++;
    }
    for (int i = 0; i < cnt; i++) {
        num *= 9;
    }
    for (int i = n - num; i < n; i++) {
        int sum = 0 , tmp_num = i;
        while (tmp_num > 0) {
            sum += tmp_num % 10;
            tmp_num /= 10;
        }
        if (i + sum == n) {
            cout << i << '\n';
            return 0;
        }
    }
    cout << 0;
    return 0;
}
*/

/*2
#include <iostream>
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a , b , c , d , e , f , x , y;
    cin >> a >> b >> c >> d >> e >> f;
    if (a == 0) {
        y = c / b;
        if (e == 0) {
            x = f / d;
        }
        else {
            x = (f - e * c / b) / d;
        }
    }
    else if (b == 0) {
        x = c / a;
        if (d == 0) {
            y = f / e;
        }
        else {
            y = (f - c * d / a) / e;
        }
    }
    else if (d == 0) {
        y = f / e;
        x = (c - b * f / e) / a;
    }
    else if (e == 0) {
        x = f / d;
        y = (c - a * f / d) / b;
    }
    else {
        x = (c * e - b * f) / (a * e - b * d);
        y = (c * d - f * a) / (b * d - e * a);
    }
    cout << x << ' ' << y << '\n';
    return 0;
}
*/
