/* 백준 1920 - 수 찾기 (이분 탐색)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int n , m;
    static int[] init_table;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine() , " ");

        Map<Integer , Integer> table = new HashMap<>();
        for (int i = 0; i < n; i++) {
            table.put(Integer.parseInt(st.nextToken()) , 0);
        }

        m = Integer.parseInt(br.readLine());
        init_table = new int[m];
        st = new StringTokenizer(br.readLine() , " ");

        for (int i = 0; i < m; i++) {
            init_table[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            if (table.containsKey(init_table[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
 */