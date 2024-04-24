/*1
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static long gcd(long a , long b) {
        long r;
        if (b != 0) {
            r = a % b;
            a = b;
            b = r;
            return gcd(a , b);
        }
        else {
            return a;
        }
    }
    public static long gcp(long a , long b) {
        long gcd = gcd(a , b);
        return a * b / gcd;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        long a_upper = Integer.parseInt(st.nextToken());
        long a_lower = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine() , " ");
        long b_upper = Integer.parseInt(st.nextToken());
        long b_lower = Integer.parseInt(st.nextToken());

        long gcp = gcp(a_lower , b_lower);

        long ans_upper = a_upper * (gcp / a_lower) + b_upper * (gcp / b_lower);
        long ans_lower = gcp;

        if (gcd(ans_upper , ans_lower) != 0) {
            long div = gcd(ans_upper , ans_lower);
            ans_upper = ans_upper / div;
            ans_lower = ans_lower / div;
        }
        bw.write(ans_upper + " " + ans_lower);
        bw.flush();
        bw.close();
    }
}
 */
