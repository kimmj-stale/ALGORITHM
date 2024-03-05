/*1
#include <iostream>
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int arrayx[1001] = {0} , arrayy[1001] = {0} , x , y;
    for (int i = 0; i < 3; i++) {
        cin >> x >> y;
        arrayx[x] += 1;
        arrayy[y] += 1;
    }
    for (int i = 1; i <= 1000; i++) {
        if (arrayx[i] == 1) {
            cout << i << ' ';
        }
    }
    for (int i = 1; i <= 1000; i++) {
        if (arrayy[i] == 1) {
            cout << i;
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

    long int a;
    cin >> a;
    cout << 4 * a << '\n';
}
*/

/*3
#include <iostream>
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n , x , y , min_x = 100001 , min_y = 100001 , max_x = -100001 , max_y = -100001;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> x >> y;
        if (min_x >= x) {
            min_x = x;
        }
        if (max_x <= x) {
            max_x = x;
        }
        if (min_y >= y) {
            min_y = y;
        }
        if (max_y <= y) {
            max_y = y;
        }
    }
    int land = (max_x - min_x) * (max_y - min_y);
    if (land >= 0) {
        cout << land << '\n'; 
    }
    else {
        cout << - land << '\n';
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

//Equilateral, Isosceles, Scalene, Error
    int a , b , c;
    cin >> a >> b >> c;
    if (a + b + c == 180) {
        if (a == 60 && b == 60 && c == 60) {
            cout << "Equilateral" << '\n';
        }
        else if (a == b || b == c || a == c) {
            cout << "Isosceles" << '\n';
        }
        else {
            cout << "Scalene" << '\n';
        }
    }
    else {
        cout << "Error" << '\n';
    }
}
*/

/*5
#include <iostream>
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a , b , c;
    while (1) {
        cin >> a >> b >> c;
        if (a == 0 && b == 0 && c == 0){
            break;
        }
        else if (a + b <= c || a + c <= b || b + c <= a) {
            cout << "Invalid" << '\n';
        }
        else {
            if (a == b && b == c && a == c) {
                cout << "Equilateral" << '\n';
            }
            else if (a == b || b == c || a == c) {
                cout << "Isosceles" << '\n';
            }
            else {
                cout << "Scalene" << '\n';
            }
        }
    }
}
*/

/*6
#include <iostream>
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a , b , c;
    cin >> a >> b >> c;
    if (a + b <= c) {
        cout << 2 * a + 2 * b - 1 << '\n';
    }
    else if (a + c <= b) {
        cout << 2 * a + 2 * c - 1 << '\n';
    }
    else if (b + c <= a) {
        cout << 2 * b + 2 * c - 1 << '\n';
    }
    else {
        cout << a + b + c << '\n';
    }
}
*/
