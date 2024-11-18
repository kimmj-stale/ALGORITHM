/* sw expert 문제해결 기본 - 거듭제곱
import java.util.Scanner;

public class Solution {
    static int n , a , b , ans;
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            ans = 1;
            recursion(a , b , 0);
            System.out.println("#" + n + " " + ans);
        }
    }
    static void recursion(int a , int b , int depth) {
        if (depth == b) return;
        else {
            depth++;
            ans *= a;
            recursion(a , b , depth);
        }
    }
}
 */

/* 백준 10830 - 행렬 제곱
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static long b;
    static int[][] table , sub , ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine() , " ");
        n = Integer.parseInt(st.nextToken());
        b = Long.parseLong(st.nextToken());
        table = new int[n][n];
        ans = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < n; j++) {
                table[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        ans = divide(table , b);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1) sb.append(ans[i][j] % 1000).append("\n");
                else sb.append(ans[i][j] % 1000).append(" ");
            }
        }
        System.out.println(sb);
    }
    static int[][] divide(int[][] arr1 , long cnt) {
        if (cnt == 1L) return arr1;

        int[][] div = divide(arr1 , cnt / 2);
        div = arrayMultiply(div , div);
        if (cnt % 2 != 0L) div = arrayMultiply(div , arr1);

        return div;
    }

    static int[][] arrayMultiply(int[][] arr1 , int[][] arr2) {
        sub = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    sub[i][j] += arr1[i][k] * arr2[k][j];
                }
                sub[i][j] %= 1000;
            }
        }
        return sub;
    }
}
 */