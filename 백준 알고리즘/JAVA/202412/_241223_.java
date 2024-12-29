/* 백준 16139 인간-컴퓨터 상호작용
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int c , l , r;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String S = br.readLine();
        int[][] arr = new int[26][S.length() + 1];
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'a'][i + 1]++;
            for (int j = 0; j < 26; j++) {
                arr[j][i + 1] += arr[j][i];
            }
        }

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            c = st.nextToken().charAt(0) - 'a';
            l = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());

            int ans = arr[c][r + 1] - arr[c][l];
            bw.write(ans + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
 */