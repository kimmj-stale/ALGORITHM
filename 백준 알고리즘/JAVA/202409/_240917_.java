/* 연속합 - 4
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine() , " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] sum = new int[n + 1];
        st = new StringTokenizer(br.readLine() , " ");

        sum[0] = 0;
        arr[0] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i - 1] + arr[i - 1];
        }
        sum[n] = sum[n - 1] + arr[n - 1];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            int idx_1 = Integer.parseInt(st.nextToken());
            int idx_2 = Integer.parseInt(st.nextToken());
            sb.append(sum[idx_2] - sum[idx_1 - 1]).append("\n");
        }
        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */