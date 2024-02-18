/*1
#include <iostream>
using namespace std;
int main() {
    int a , b;
    cin >> a >> b;
    if (a > b) {
        cout << '>' << '\n';
    }
    else if (a == b) {
        cout << "==" << '\n';
    }
    else {
        cout << '<' << '\n';
    }
}
*/

/*2
#include <iostream>
using namespace std;
int main() {
    int score;
    cin >> score;
    if (score >= 90) {
        cout << 'A' << '\n;
    }
    else if (score >= 80) {
        cout << 'B' << '\n;
    }
    else if (score >= 70) {
        cout << 'C' << '\n;
    }
    else if (score >= 60){
        cout << 'D' << '\n;
    }
    else {
        cout << 'F' << '\n;
    }
}
*/

/*3
#include <iostream>
using namespace std;
int main() {
    int year;
    cin >> year;
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        cout << '1' << '\n';
    }
    else {
        cout << '0' << '\n';
    }
}
*/

/*4
#include <iostream>
using namespace std;
int main() {
    int x , y;
    cin >> x >> y;
    if (x > 0 && y > 0) {
        cout << '1' << '\n';
    }
    else if (x > 0 && y < 0){
        cout << '4' << '\n';
    }
    else if (x < 0 && y < 0){
        cout << '3' << '\n';
    }
    else {
        cout << '2' << '\n';
    }   
}
*/

/*5
#include <iostream>
using namespace std;
int main() {
    int h , m;
    cin >> h >> m;
    if (m < 45) {
        if (h == 0) {
            h = 23;
        }
        else {
            h -= 1;
        }
        m += 15;
    }
    else {
        m -= 45;
    }
    cout << h << ' ' << m << '\n';
}
*/
#include <iostream>
using namespace std;
int main() {
    int h , m , in_m;
    cin >> h >> m >> in_m;
    if (m + in_m >= 60) {
        if (h + (m + in_m)/60 > 23) {
            h = (m + in_m)/60 + h - 24;
        }
        else {
            h = h + (m + in_m)/60;
        }
        m = (m + in_m)%60;
    }
    else {
        m += in_m;
    }
    cout << h << ' ' << m << '\n';
}