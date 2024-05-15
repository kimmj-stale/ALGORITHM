/*1
import java.io.*;

public class Main {
    public static long ans = 1;
    public static long Factorial(int a) {
        if (a > 1) {
            ans *= a;
            a--;
            if (a == 1) return ans;
            else return Factorial(a);
        }
        else return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        long ans = Factorial(n);
        bw.write(String.valueOf(ans));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */
