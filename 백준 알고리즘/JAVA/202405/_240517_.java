/*1
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int Factorial(int a) {
        int num = 1;
        if (a == 0) return num;
        else {
            while (a != 1) {
                num *= a;
                a--;
            }
            return num;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int ans = Factorial(n) / (Factorial(k) * Factorial(n - k));
        bw.write(String.valueOf(ans));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */

/*2
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;
    //파스칼 삼각형 활용 알고리즘
    //nCr = (n - 1Cr - 1) + (n - 1Cr) 반복 구문
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            dp = new int[k + 1][n + 1];

            sb.append(getBridge(k , n) + "\n");
        }
        System.out.println(sb);
    }
    static int getBridge(int b , int a) {
        if (dp[b][a] > 0) return dp[b][a];
        if (a == 0 || a == b) return dp[b][a] = 1;
        return getBridge(b - 1 , a- 1) + getBridge(b - 1 , a);
    }
}
 */
