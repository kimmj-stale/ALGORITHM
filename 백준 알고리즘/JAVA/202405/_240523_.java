/* 그리디 1
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine() , " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] table = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            table[i] = Integer.parseInt(br.readLine());
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int div = k / table[i];
            ans += div;
            k -= div * table[i];
            if (k == 0) break;
        }
        bw.write(ans + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
 */
