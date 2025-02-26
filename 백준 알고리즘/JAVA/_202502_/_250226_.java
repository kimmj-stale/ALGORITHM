/* 9251
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line_A = br.readLine();
        String line_B = br.readLine();

        int[][] dp = new int[line_A.length() + 1][line_B.length() + 1];
        for (int i = 1; i <= line_A.length(); i++) {
            for (int j = 1; j <= line_B.length(); j++) {
                if (line_A.charAt(i - 1) == line_B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j] , dp[i][j - 1]);
                }
            }
        }

        bw.write(dp[line_A.length()][line_B.length()] + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */

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
        int[] value = new int[n + 1];
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            bagpack[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= bagpack[i]) {
                    dp[i][j] = Math.max(dp[i - 1][j] , dp[i - 1][j - bagpack[i]] + value[i]);
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