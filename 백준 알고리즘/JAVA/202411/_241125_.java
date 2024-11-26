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

/* 백준 1654 - 전선 자르기
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n , m;
    static int[] cable;
    static long min , max , mid;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        cable = new int[n];
        for (int i = 0; i < n; i++) {
            cable[i] = Integer.parseInt(br.readLine());
        }
        //이분탐색 알고리즘 사용
        min = 1L;
        mid = 0L;
        max = Long.valueOf(Arrays.stream(cable).max().getAsInt());

        while (true) {
            int sum = 0;
            mid = (min + max) / 2;
            for (int i = 0; i < cable.length; i++) {
                sum += cable[i] / mid;
            }

            if (min > max) break;
            else if (sum >= m) min = mid + 1;
            else max = mid - 1;
        }
        bw.write(max + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */
