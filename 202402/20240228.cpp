/*1
#include <iostream>
#include <cstring>
using namespace std;
int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    char array[5][16] = {'\0'};
    char ans[16] = {};
    int c = 0;

    for (int i = 0; i < 5; i++) {
        cin >> ans;
        strcpy(array[i] , ans);
    }
    
    for (int i = 0; i < 16; i++){
        for (int j = 0; j < 5; j++) {
            if (array[j][i] != '\0') {
                cout << array[j][i];
            }
        }
    }
}
*/

/*2
#include <iostream>
using namespace std;
int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n , sum = 0;
    string s;
    cin >> s >> n;
    for (int i = 0; i < s.length(); i++) {
        for (int j = 'A'; j <= 'Z'; j++) {
            if (s[i] == j) {
                int b = 0;
                b = j - 55;
                sum += b;
                if (i == s.length() - 1) {
                    break;
                }
                sum *= n;
            }
        }
        for (int j = '0'; j <= '9'; j++) {
            if (s[i] == j) {
                int a = 0;
                a = j - '0';
                sum += a;
                if (i == s.length() - 1) {
                    break;
                }
                sum *= n;
            }
        }
    }
    cout << sum << '\n';
}
*/

/*3
#include <iostream>
#include <vector>
using namespace std;
int main(void) {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int num , n;
    vector<char> vec;

    cin >> num >> n;
    while (1) {
        int last = num % n;
        if (num == 0) {
            break;
        }
        if (last < 10) {
            char k = last + '0';
            num -= last;
            num /= n;
            vec.push_back(k);
        }
        else if (last >= 10) {
            char k = last + 55;
            num -= last;
            num /= n;
            vec.push_back(k);
        }
    }
    for (int i = vec.size() - 1; i >= 0; i--) {
        cout << vec[i];
    }
}
*/

