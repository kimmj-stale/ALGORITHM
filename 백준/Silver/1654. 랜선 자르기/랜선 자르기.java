import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n , k;
    static long[] line;
    static long init , mid , end;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine() , " ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        long max = Long.MIN_VALUE;
        line = new long[n];
        for (int i = 0; i < n; i++) {
            line[i] = Integer.parseInt(br.readLine());
        }

        end = Arrays.stream(line).max().getAsLong();

        long ans = 0L;
        init = 1L;
        mid = 0L;
        while (true) {
            ans = 0;
            mid = (init + end) / 2;
            for (int i = 0; i < n; i++) {
                ans += line[i] / mid;
            }
            if (init > end) break;
            else if (ans < k) end = mid - 1;
            else init = mid + 1;
        }

        bw.write(mid + "");
        bw.flush();
        br.close();
        bw.close();
    }
}