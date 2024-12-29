/* 백준 10844 - 쉬운 계단 수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int n;
    static long[][] numArr;
    static long mod = 1_000_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        numArr = new long[n + 1][10];

        for (int i = 1; i <= 9; i++) {
            numArr[1][i] = 1L;
        }
        if (n > 1) {
            for (int i = 1; i < 9; i++) {
                numArr[2][i] = 2L;
            }
            numArr[2][9] = 1L;

            for (int i = 3; i <= n; i++) {
                for (int j = 1; j <= 9; j++) {
                    if (j == 1) numArr[i][1] = (numArr[i - 2][1] + numArr[i - 1][2]) % mod;
                    else if (j == 9) numArr[i][9] = (numArr[i - 1][8]) % mod;
                    else numArr[i][j] = (numArr[i - 1][j - 1] + numArr[i - 1][j + 1]) % mod;
                }
            }
        }

        long[] ans = new long[10];

        for (int i = 0; i <= 9; i++) {
            ans[i] = numArr[n][i];
        }

        System.out.println(Arrays.stream(ans).sum() % mod);
    }
}
 */