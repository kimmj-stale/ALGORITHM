/* DFS 1
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] visited;
    public static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n];
        array = new int[m];
        DFS(n , m , 0);

    }
    static void DFS(int N , int M , int depth) {
        if (depth == M) {
            for (int val : array) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                array[depth] = i + 1;
                DFS(N , M , depth + 1);
                visited[i] = false;
            }
        }
    }
}
 */
