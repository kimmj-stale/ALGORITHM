#include "iostream"
#include "vector"
using namespace std;
int main(void) {
    int n , m;
    cin >> n >> m;
    int** array1 = new int*[n];
    for (int i = 0; i < n; i++){
        array1[i] = new int[m];
    }
    
    int** array2 = new int*[n];
    for (int i = 0; i < n; i++) {
        array2[i] = new int[m];
    }
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++){
            int a;
            cin >> a;
            array1[i][j] = a;
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            int b;
            cin >> b;
            array2[i][j] = b;
        }
    }
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++) {
            cout << array1[i][j] + array2[i][j] << ' ';
        }
        cout << endl;
    }
}