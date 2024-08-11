/* DFS 4
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int n , m;
    public static int[] array;

    public static void DFS(int rec , int depth) throws IOException{
        if (depth == m) {
            for (int val : array) {
                bw.write(val + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = rec; i <= n; i++) {
            array[depth] = i;
            DFS(i , depth + 1);
        }
    }
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        array = new int[m];

        DFS(1 , 0);
        br.close();
        bw.flush();
        bw.close();
    }
}
 */
