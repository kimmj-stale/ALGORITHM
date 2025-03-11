import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n , cnt1 , cnt0 , cntm1;
    static boolean def;
    static int[][] Large;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        Large = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < n; j++) {
                Large[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cnt1 = 0;
        cnt0 = 0;
        cntm1 = 0;

        div(0 , 0 , n);
        bw.write(cntm1 + "\n" + cnt0 + "\n" + cnt1);
        bw.flush();
        bw.close();
        br.close();
    }
    static void div(int x , int y , int n) {
        def = true;

        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (Large[x][y] != Large[i][j]) {
                    def = false;
                    break;
                }
            }
            if (!def) break;
        }

        if (!def) {
            for (int i = x; i < x + n; i += n / 3) {
                for (int j = y; j < y + n; j += n / 3) {
                    div(i , j , n / 3);
                }
            }
        } else {
            if (Large[x][y] == 1) cnt1++;
            else if (Large[x][y] == 0) cnt0++;
            else cntm1++;
        }
    }
}