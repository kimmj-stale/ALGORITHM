/*1
#include <iostream>
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    
    while (1) {
        int  a , sum = 0 , array[100001] = {0};
        cin >> a;
        if (a == -1) {
            break;
        }
        else {
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    sum += i;
                    array[i] = i;
                }
            }
            if (sum == a) {
                cout << a << " = ";
                cout << 1;
                for (int j = 2; j < a; j++) {
                    if (array[j] != 0) {
                        cout << " + " << j;
                    }
                }
                cout << '\n';
            }
            else {
                cout << a << " is NOT perfect." << '\n';
            }
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

    int a , n , array[1001] = {0} , count = 0;
    cin >> n;
    array[1] = 0;
    for (int i = 0; i < n; i++) {
        cin >> a;
        array[a] = 1;
    }
    
    for (int i = 3; i < 1001; i++) {
        if (array[i] == 1) {
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
    }
    for (int i = 2; i < 1001; i++) {
        if (array[i] == 1) {
            count += 1;
        }
    }
    cout << count;
}
*/
