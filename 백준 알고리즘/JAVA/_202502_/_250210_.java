/* 2559
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n , k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine() , " ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] prefix = new int[n + 1];

        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = Integer.parseInt(st.nextToken()) + prefix[i];
        }

        int max = Integer.MIN_VALUE;
        for (int i = k; i <= n; i++) {
            int max_val = prefix[i] - prefix[i - k];
            if (max < max_val) {
                max = max_val;
            }
        }

        bw.write(max + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */

/* 1912
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine() , " ");
        int[] prefix = new int[n];
        for (int i = 0; i < n; i++) {
            prefix[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int max = 0;
        for (int val : prefix) {
            if (sum + val > 0) {
                val += sum;
                sum = val;
            } else sum = 0;

            if (max < val) max = val;
        }

        bw.write(max + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */