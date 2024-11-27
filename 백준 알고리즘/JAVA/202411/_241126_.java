/* 백준 2805 - 나무 자르기
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n , req;
    static int[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine() , " ");
        n = Integer.parseInt(st.nextToken());
        req = Integer.parseInt(st.nextToken());
        tree = new int[n];

        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }

        long max = Long.valueOf(Arrays.stream(tree).max().getAsInt());
        long min = 1L;
        long mid = 0L;
        long val = 0L;

        while (true) {
            mid = (max + min) / 2;
            long sum = 0L;

            for (int i = 0; i < tree.length; i++) {
                val = tree[i] - mid;
                if (val >= 0) sum += val;
            }

            if (min > max) break;
            else if (sum >= req) min = mid + 1;
            else max = mid - 1;
        }
        bw.write(mid + "");
        bw.flush();
        br.close();
        bw.close();

    }
}
 */