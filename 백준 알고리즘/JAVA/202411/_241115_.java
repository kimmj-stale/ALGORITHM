/* 백준 1629 - 곱셈(제곱의 모듈러 연산 패턴 알기)
//a , b , c 모두 int 자료형
//(a^b)mod(c)값을 출력하면 됨

import java.io.*;
import java.util.StringTokenizer;

//모듈러 반복 제곱법 이라는 연산을 이용하여 구현하면 됨
//해당 알고리즘의 시간 복잡도는 O(log n)수준이라 빠른 편이다.
public class Main {
    static int a , b , c;
    static long ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        bw.write(modular(a , b , c) + "");
        bw.flush();
        br.close();
        bw.close();

    }
    //모듈러 연산의 패턴성을 확인하는 알고리즘
    static long modular(long a , long b , long c) {
        ans = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                ans = (a * ans) % c;
            }
            a = (a * a) % c;
            b /= 2;
        }
        return ans;
    }
}
 */
/* 백준 스도쿠 복습
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] sudoku;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        sudoku = new int[9][9];
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        DFS();
    }
    static void DFS() {
        int[] point = findZero();
        if (point == null) {
            printAns();
            System.exit(0);
        }

        int x = point[0];
        int y = point[1];
        for (int i = 1; i <= 9; i++) {
            if (search(x , y , i)) {
                sudoku[x][y] = i;
                DFS();
                sudoku[x][y] = 0;
            }
        }
    }
    //0의 위치를 리턴해주는 함수 , 이를 이용해 0의 좌표를 특정할 수 있음
    static int[] findZero() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) return new int[] {i , j};
            }
        }
        return null;
    }
    //각 좌표에 해당값(n)이 있다? -> false리턴
    //가로 + 세로 + 3x3 위치에 있는 조건 검사
    static boolean search(int x , int y , int n) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[x][i] == n) return false;
        }
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][y] == n) return false;
        }
        int start_x = (x / 3) * 3;
        int start_y = (y / 3) * 3;
        for (int i = start_x; i < start_x + 3; i++) {
            for (int j = start_y; j < start_y + 3; j++) {
                if (sudoku[i][j] == n) return false;
            }
        }
        return true;
    }
    static void printAns() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 */
/* 백준 2740 - 행렬 곱셈
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int ans;
    static int[][] arr1 , arr2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine() , " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr1 = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine() , " ");
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        arr2 = new int[m][k];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < k; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                ans = 0;
                for (int l = 0; l < m; l++) {
                    ans += arr1[i][l] * arr2[l][j];
                }
                if (j == k - 1) sb.append(ans + "\n");
                else sb.append(ans + " ");
            }
        }

        bw.write(sb + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
 */