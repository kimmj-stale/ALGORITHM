/*0
//역사적인 첫 c++ 출력
#include <iostream>
int main() {
    std::cout << "Hello World!";
}
*/

/*1
#include <iostream>
using namespace std;
int main() {
    int a , b;
    cin >> a >> b;
    cout << a + b << '\n';
}
*/

/*2
#include <iostream>
using namespace std;
int main() {
    int a , b;
    cin >> a >> b;
    cout << a - b << '\n';
}
*/

/*3
#include <iostream>
using namespace std;
int main() {
    int a , b;
    cin >> a >> b;
    cout << a * b << '\n';
}
*/

/*4
//난이도 급상승
#include <iostream>
using namespace std;
int main() {
    double a , b , c;
    cin >> a >> b;
    c = a/b;
    cout << fixed ;
    cout.precision(10);
    cout << c << endl;
}
*/

/*5
#include <iostream>
using namespace std;
int main() {
    int a , b ;
    cin >> a >> b;
    cout << fixed ;
    cout.precision(10);
    cout << a + b << '\n' << a - b << '\n' << a * b << '\n' << a / b << '\n' << a % b << '\n';
}
*/

/*6
#include <iostream>
using namespace std;
int main() {
    string a;
    cin >> a;
    cout << a << "\?\?!" << '\n';
}
*/

/*7
#include <iostream>
using namespace std;
int main() {
    int year;
    cin >> year;
    cout << year - 543 << '\n';
}
*/

/*8
#include <iostream>
using namespace std;
int main() {
    int A , B , C;
    cin >> A >> B >> C;
    cout << (A + B) % C << '\n' << ((A % C) + (B % C))% C << '\n' << (A * B) % C << '\n' << ((A % C) * (B % C)) % C << '\n';
}
*/

/*9
#include <iostream>
using namespace std;
int main() {
    int a , b;
    int b1 , b2 , b3;
    cin >> a >> b;

    b1 = b / 100;
    b2 = (b - b1 * 100) / 10;
    b3 = (b - b1 * 100 - b2 * 10);

    cout << b3 * a << '\n' << b2 * a << '\n' << b1 * a << '\n' << a * b << '\n';
    }
*/

/*10
#include <iostream>
using namespace std;
int main() {
    long a , b , c;
    cin >> a >> b >> c;
    cout << a + b + c << '\n';
}
*/

