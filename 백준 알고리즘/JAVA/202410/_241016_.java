/* 백준 1149 복습
import java.io.*;
import java.util.StringTokenizer;

//dynamic programming을 이용한 문제 풀이가 필요하다. 앞서 더한 값 + 다음에 올 값을 더한 후 크기 비교를 통해 값을 특정한다.
public class Main {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 1][3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < 3; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //dp를 이용해 올 수 있는 이전값들의 크기를 비교 후 작은 값을 다음 값으로 선정
        //다음 값으로 오는 값은 그 값의 크기를 계속 축적시킨 후 최종적으로 dp[n-1][0 , 1 , 2]끼리 비교
        for (int i = 1; i < n; i++) {
            dp[i][0] += Math.min(dp[i - 1][1] , dp[i - 1][2]);
            dp[i][1] += Math.min(dp[i - 1][0] , dp[i - 1][2]);
            dp[i][2] += Math.min(dp[i - 1][0] , dp[i - 1][1]);
        }
        //dp[n - 1][0] , [1] , [2] 세 값을 비교 후 정답 선정
        int ans = Math.min(Math.min(dp[n - 1][0] , dp[n - 1][1]) , dp[n - 1][2]);
        bw.write(ans + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
 */
