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