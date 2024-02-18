/*1
#include <iostream>
using namespace std;
int main() {
    int a , b , c;
    cin >> a >> b >> c;
    if (a == b && b == c) {
        cout << 10000 + 1000 * a << '\n';
    }
    else if (a == b && a != c) {
        cout << a * 100 + 1000 << '\n';
    }
    else if (a == c && b != c) {
        cout << a * 100 + 1000 << '\n';
    }
    else if (b == c && a != c) {
        cout << b * 100 + 1000 << '\n';
    }
    else {
        int max;
        if (a > b && a > c) {
            max = a;
        }
        else if (b > a && b > c){
            max = b;
        }
        else {
            max = c;
        }
        cout << max * 100 << '\n';
    }
}
*/

/*2
#include <iostream>
using namespace std;
int main() {
    int a;
    cin >> a;
    for (int i = 1; i < 10; i++) {
        cout << a << " * " << i << " = " << a * i << '\n';
    }
}
*/

/*3
#include <iostream>
using namespace std;
int main() {
    int a , b ,c;
    cin >> a;
    for (int i = 0; i < a; i++) {
        cin >> b >> c;
        cout << b + c << '\n';
    }
}
*/

/*4
#include <iostream>
using namespace std;
int main() {
    int a , sum = 0;
    cin >> a;
    for (int i = 1; i <= a; i++) {
        sum += i;
    }
    cout << sum << '\n';
}
*/

/*5
#include <iostream>
using namespace std;
int main() {
    int total , var , sum = 0;
    cin >> total >> var;
    for (int i = 0; i < var ; i++) {
        int price , num;
        cin >> price >> num;
        sum += price * num;
    }
    string ans = (sum == total) ? "Yes":"No";
    cout << ans << '\n';
}
*/

/*6
#include <iostream>
using namespace std;
int main() {
    int a , time;
    cin >> a;
    time = a / 4;
    for (int i = 0; i < time; i++) {
        cout << "long" << " ";
    }
    cout << "int" << '\n';
}
*/

/*7 (224 ms걸림)
#include <iostream>
int main() {
    std :: ios_base :: sync_with_stdio(false);
    std :: cin.tie(NULL);
    int n , a , b;
    std :: cin >> n;
    for (int i = 0; i < n; i++) {
        std :: cin >> a >> b;
        std :: cout << a + b << '\n';
    }
}
*/

/*8
#include <iostream>
using namespace std;
int main() {
    int a , b , c;
    cin >> c;
    for (int i = 1; i <= c; i++){
         cin >> a >> b;
         cout << "Case #" << i << ": " << a + b << '\n';
    } 
}
*/

/*9
#include <iostream>
using namespace std;
int main() {
    int a , b , c;
    cin >> c;
    for (int i = 1; i <= c; i++){
         cin >> a >> b;
         cout << "Case #" << i << ": " << a << " + " << b << " = "<< a + b << '\n';
    } 
}
*/

/*10
#include <iostream>
using namespace std;
int main() {
    int a;
    cin >> a;
    for (int i = 1; i <= a; i++){
        for (int j = 0; j < i; j++){
            cout << '*';
        }
        cout << '\n';
    }
}
*/

/*11
#include <iostream>
using namespace std;
int main() {
    int a;
    cin >> a;
    for (int i = 1; i <= a; i++){
        for (int k = 0; k < a - i; k++) {
            cout << ' ';
        }
        for (int j = 0; j < i; j++) {
            cout << '*';
        }
        cout << '\n';
    }
}
*/

/*12
#include <iostream>
#include <stdbool.h>
using namespace std;
int main() {
    while (true) {
        int a , b;
        cin >> a >> b;
        if (a == 0 && b == 0) {
            break;
        }
        cout << a + b << '\n';
    }
}
*/

/*13 (난이도 급상승 2)
#include <iostream>
#include <list>
using namespace std;
int main() {
    list<int> add_numbers;
    while (1) {
        int a , b;
        cin >> a >> b;
        if (cin.eof() == true) {
            break;
        }
        add_numbers.push_back(a + b);
    }
    for (int i : add_numbers) {
        std::cout << i << "\n";
    }
}
*/
