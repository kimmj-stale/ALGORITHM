/* 12865
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine() , " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] bagpack = new int[n + 1];
        int[] packageValue = new int[n + 1];
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            bagpack[i] = Integer.parseInt(st.nextToken());
            packageValue[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                //j - bagpack[i] < 0 인 경우 이전 값과 동일하도록
                dp[i][j] = dp[i - 1][j];
                if (j >= bagpack[i]) {
                    //j - bagpack[i] = 버틸 수 있는 무게 - 해당 짐의 무게
                    //이전 버틸 수 있었던 짐의 양과 새로 갱신된 버틸 수 있는 무게의 양 + 해당 물건의 가치
                    dp[i][j] = Math.max(dp[i - 1][j] , dp[i - 1][j - bagpack[i]] + packageValue[i]);
                }
            }
        }

        bw.write(dp[n][m] + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */

/* 백트레킹 15649
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n , m;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n];

        arr = new int[m];
        DFS(0);

        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
    static void DFS(int depth) {
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                DFS(depth + 1);
                visited[i] = false;
            }
        }
    }
}
 */
