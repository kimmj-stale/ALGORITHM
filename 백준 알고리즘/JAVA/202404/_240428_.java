/*1
import java.io.*;

public class Main {
    public static int div(int a , int b) {
        return a / b;
    }
    public static int gcd(int a , int b) {
        int r;
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while(b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] table = new int[n];
        for (int i = 0; i < n; i++) {
            table[i] = Integer.parseInt(br.readLine());
        }
        int[] sp = new int[n];
        int f_gcd = 0;
        for (int i = 0; i < n - 1; i++) {
            sp[i] = table[i + 1] - table[i];
            int gcd = gcd(sp[i] , f_gcd);
            f_gcd = gcd;
        }
        int ans = div(table[n - 1] , f_gcd) - div(table[0] , f_gcd) - n + 1;
        bw.write(ans + "");
        bw.flush();
        bw.close();
    }
}
 */
