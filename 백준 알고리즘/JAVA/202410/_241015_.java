/* 백준 1149 - RGB 거리
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        //dynamic programming 이용
        dp = new int[n + 1][3];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < 3; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < n; i++) {
            dp[i][0] += Math.min(dp[i - 1][1] , dp[i - 1][2]);
            dp[i][1] += Math.min(dp[i - 1][0] , dp[i - 1][2]);
            dp[i][2] += Math.min(dp[i - 1][0] , dp[i - 1][1]);
        }

        int ans = Math.min(Math.min(dp[n - 1][0] , dp[n - 1][1]) , dp[n - 1][2]);
        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */