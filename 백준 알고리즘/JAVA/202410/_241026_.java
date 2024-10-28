/* 백준 1932 - 정수 삼각형(역 dp)
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] triangle;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        triangle = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < n; j++) {
                if (j <= i) triangle[i][j] = Integer.parseInt(st.nextToken());
                else triangle[i][j] = 0;
            }
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j < n; j++) {
                triangle[i - 1][j - 1] += Math.max(triangle[i][j] , triangle[i][j - 1]);
            }
        }

        bw.write(triangle[0][0] + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */