/*1
import java.io.*;

public class Main {
    public static Boolean is_Prime(int a) {
        if (a < 2) {
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int ans = 0;
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            for (int i = n + 1; i <= 2 * n; i++) {
                if (is_Prime(i)) {
                    ans++;
                }
            }
            sb.append(ans).append("\n");
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */


/*2

 */