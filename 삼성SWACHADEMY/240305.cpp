/*1
#include <iostream>
using namespace std;
int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int t , n ;
    cin >> t;
    for (size_t i = 1; i <= t; i++) {
        int sum = 0;
        for (int j = 0; j < 10; j++) {
            cin >> n;
            if (n % 2 != 0) {
                sum += n;
            }
        }
        cout << '#' << i << ' ' << sum << '\n';
    }
}
*/

/*2
#include <iostream>
#include <cmath>
using namespace std;
int main(void) {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int t , n;
    int avg;
    cin >> t;
    for (int i = 1; i <= t; i++) {
        int sum = 0;
        for (int j = 0; j < 10; j++) {
            cin >> n;
            sum += n;
        }
        avg = round((double) (sum / 10));
        cout << '#' << i << ' ' << avg << '\n';
    }
    return 0;
}
*/
