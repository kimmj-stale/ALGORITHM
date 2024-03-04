/*1
#include <iostream>
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int num , add = 1 , rec_num = 2;
    cin >> num;
    while (1) {
        if (num < (rec_num + 6 * add) && num >= rec_num) {
            cout << add + 1 << '\n';
            break;
        }
        else if (num == 1) {
            cout << 1;
            break;
        }
        else {
            rec_num += 6 * add;
            add += 1;
        }
    }
}
*/

/*2
#include <iostream>
using namespace std;
int main() {
    int ans , num = 2 , n = 1;
    cin >> ans;

    while (1) {
        if (ans == 1)
        {
            cout << 1 << '/' << 1;
            break;
        }
        if (ans <= num + n && ans >= num) {
            if ( n % 2 != 0) {
                cout << (ans - num + 1) << '/' << (n - ans + num + 1);
                break;
            }
            else if (n % 2 == 0) {
                cout << (n - ans + num + 1) << '/' << (ans - num + 1);
                break;
            }
        }
        else {
            n += 1;
            num += n;
        }
    }
}
*/

/*3
#include <iostream>
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a , b , v , day = 0;
    cin >> a >> b >> v;
    if (a == v) {
        cout << 1;
    }
    else if ((v - a) % (a - b) == 0) {
        day = (v - a) / (a - b) + 1;
        cout << day;
    }
    else if ((v - a) % (a - b) != 0) {
        day = (v - a) / (a - b) + 2;
        cout << day;
    }
    else {
        cout << 2;
    }
}
*/

/*4
#include <iostream>
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a , b;
    while (1) {
        cin >> a >> b;
        if (a == 0 && b == 0) {
            break;
        }
        else {
            if  (a % b == 0) {
                cout << "multiple" << '\n';
            }
            else if (b % a == 0) {
                cout << "factor" << '\n';
            }
            else if (a % b != 0 && b % a != 0) {
                cout << "neither" << '\n';
            }
        }
    }
}
*/
