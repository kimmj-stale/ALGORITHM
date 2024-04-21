/*1
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static int gcd(int a , int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() , " ");
            int e1 = Integer.parseInt(st.nextToken());
            int e2 = Integer.parseInt(st.nextToken());
            int ans = e1 * e2 / gcd(e1 , e2);
            bw.write(ans + "\n");
        }
        bw.flush();
        bw.close();
    }
}
 */

/*2
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    private static long gcd(long a , long b) {
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
        return  a * b / gcd;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        long ans = gcp(a , b);
        bw.write(ans + "");
        bw.flush();
        bw.close();
    }
}
 */