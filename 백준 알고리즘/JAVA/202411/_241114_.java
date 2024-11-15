/* 백준 1992 - 쿼드트리(분할 정복 + 재귀)
import java.io.*;

public class Main {
    static int n , sum;
    static int[][] Quad;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        Quad = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                Quad[i][j] = Integer.parseInt(line[j]);
            }
        }
        Quad_Tree(0 , 0 , n);
        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
    static void Quad_Tree(int x , int y , int n) {
        sum = 0;
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                sum += Quad[i][j];
            }
        }

        if (sum == n * n) {
            sb.append(1);
        } else if (sum == 0) sb.append(0);
        else {
            sb.append("(");
            Quad_Tree(x , y , n/2);
            Quad_Tree(x , y + n / 2 , n / 2);
            Quad_Tree(x + n / 2 , y , n / 2);
            Quad_Tree(x + n / 2 , y + n / 2 , n / 2);
            sb.append(")");
        }
    }
}
 */

/* 백준 1780 - 종이의 개수(분할 정복 + 재귀 응용 + 조건 잘 나누기)
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n , cnt1 , cnt0 , cntm1;
    static boolean def;
    static int[][] Large;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        Large = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < n; j++) {
                Large[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cnt1 = 0;
        cnt0 = 0;
        cntm1 = 0;

        div(0 , 0 , n);
        bw.write(cntm1 + "\n" + cnt0 + "\n" + cnt1);
        bw.flush();
        bw.close();
        br.close();
    }
    static void div(int x , int y , int n) {
        def = true;

        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (Large[x][y] != Large[i][j]) {
                    def = false;
                    break;
                }
            }
            if (!def) break;
        }

        if (!def) {
            for (int i = x; i < x + n; i += n / 3) {
                for (int j = y; j < y + n; j += n / 3) {
                    div(i , j , n / 3);
                }
            }
        } else {
            if (Large[x][y] == 1) cnt1++;
            else if (Large[x][y] == 0) cnt0++;
            else cntm1++;
        }
    }
}
 */