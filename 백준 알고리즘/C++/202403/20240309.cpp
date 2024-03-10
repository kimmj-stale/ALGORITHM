/*1
#include <iostream>
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int array[1001] = {0} , minus[1001] = {0} , n , num;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> num;
        if (num < 0) {
            minus[-num] = 1;
        }
        else {
            array[num] = 1;
        }
    }
    for (int i = 1000; i >= 1; i--) {
        if (minus[i] == 1) {
            cout << - i << '\n';
        }
    }
    for (int i = 0; i < 1001; i++) {
        if (array[i] == 1) {
            cout << i << '\n';
        }
    }
}
*/

/*2
#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a , array[101] = {0} , sum = 0 , cnt = 0;
    for (int i = 0; i < 5; i++) {
        cin >> a;
        array[a]++;
        sum += a;
    }
    cout << sum / 5 << '\n';
    for (int i = 0; i < 101; i++) {
        cnt += array[i];
        if (cnt >= 3) {
            cout << i << '\n';
            break;
        }
    }
}
*/
