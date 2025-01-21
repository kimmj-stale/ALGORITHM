/* 백준 2156 - 포도주 시식(dp)
import java.io.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] wine_dp = new int[n + 1];
        int[] dp = new int[10001];

        for (int i = 1; i <= n; i++) {
            wine_dp[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            dp[n] = wine_dp[1];
        } else if (n == 2) {
            dp[n] = wine_dp[1] + wine_dp[2];
        } else if (n >= 3) {
            dp[0] = 0;
            dp[1] = wine_dp[1];
            dp[2] = dp[1] + wine_dp[2];
            dp[3] = Math.max(dp[1] + wine_dp[3] , dp[2]);
            for (int i = 3; i <= n; i++) {
                //한 잔을 건너뛰고 두 잔 연속으로 마시기
                int f_case = dp[i - 3] + wine_dp[i - 1] + wine_dp[i];
                //한 잔을 건너뛰고 한 잔 마시기
                int s_case = dp[i - 2] + wine_dp[i];
                //이전 케이스가 더 큰 경우
                int t_case = dp[i - 1];

                int max = IntStream.of(f_case , s_case , t_case).max().getAsInt();
                dp[i] = max;
            }
        }
        bw.write(dp[n] + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */