import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n , m , sum , x1 , x2 , y1 , y2 , ans;
    static int[][] table;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine() , " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        table = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                sum += Integer.parseInt(st.nextToken());
                table[i][j] = sum;
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            ans = 0;
            sb.append(Partial_Summation(x1 , y1 , x2 , y2)).append("\n");
        }

        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
    static int Partial_Summation(int x1 , int y1 , int x2 , int y2) {
        for (int i = x1; i <= x2; i++) {
            ans += table[i][y2] - table[i][y1 - 1];
        }
        return ans;
    }
}