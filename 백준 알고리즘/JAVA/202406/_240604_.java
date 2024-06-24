/* 최소공배수 구하기
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static long LCM(long a , long b) {
        long r;
        long org_a = a;
        long org_b = b;
        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return (org_a * org_b) / a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine() , " ");
        int initial = Integer.parseInt(st.nextToken());

        int[] table = new int[n];
        table[0] = initial;
        long val = initial;
        for (int i = 1; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (initial > a) initial = a;
            table[i] = a;
            val = LCM(val , a);
        }

        for (int i = 0; i < n; i++) {
            if (table[i] == val) {
                val *= initial;
                break;
            }
        }
        bw.write(val + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
 */

