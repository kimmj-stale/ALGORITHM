/* sw expert 2005 - 파스칼 삼각형
import java.io.*;

public class Main {
    static int t , n;
    static int[][] pascal;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            pascal = new int[n + 1][n + 1];
            Pascal_triangle(n);
            System.out.println("#" + (i + 1));
            for (int l = 0; l < n; l++) {
                for (int j = 1; j <= n; j++) {
                    if (pascal[l][j] != 0) System.out.print(pascal[l][j] + " ");
                }
                System.out.println();
            }
        }

    }
    static void Pascal_triangle(int n) {
        //첫 줄 초기화 설정
        for (int i = 0; i <= n; i++) {
            pascal[0][i] = 0;
        }
        pascal[0][1] = 1;

        for (int i = 1; i <= n; i++) {
            pascal[i][0] = 0;
            for (int j = 1; j <= n; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
    }
}
 */

/* swe 2001 - 파리퇴치
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int t , n , m , sum , max;
    static int[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            max = Integer.MIN_VALUE;
            board = new int[n][n];

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine() , " ");
                for (int k = 0; k < n; k++) {
                    board[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            kill_fly();
            System.out.println("#" + (i + 1) + " " + max);
        }
    }
    static void kill_fly() {
        for (int i = 0; i < n - m + 1; i++) {
            for (int j = 0; j < n - m + 1; j++) {
                sum = 0;
                for (int k = 0; k < m; k++) {
                    for (int l = 0; l < m; l++) {
                        sum += board[i + k][j + l];
                    }
                }
                max = Math.max(sum , max);
            }
        }
    }
}
 */