/*1 (받는 수를 index로 사용하는 방법)
#include <iostream>
using namespace std;
int main() {
    int num , arr[31] = {0};
    for (int i = 0; i < 28; i++) {
        cin >> num;
        arr[num] = 1;
    }
    for (int j = 1; j <= 30; j++) {
        if (arr[j] == 0) {
            cout << j << '\n';
        }
    }
}
*/

/*2

*/
//(백준 서버 이슈로 여기까지만...)
#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    int num , arr[51] = {0} , count;
    for (int i = 0; i < 10; i++) {
        cin >> num;
        arr[num%42] += 1;
    }
    for (int j: arr) {
        if ( j != 0) {
            count += 1;
        }
    }
    cout << count << '\n';
}