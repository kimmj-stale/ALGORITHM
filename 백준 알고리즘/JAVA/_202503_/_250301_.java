/* 15650
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int n , m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        DFS(0 , 0);

        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
    static void DFS(int depth , int k) {
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = k; i < n; i++) {
                arr[depth] = i + 1;
                k++;
                DFS(depth + 1 , k);
        }
    }
}
 */