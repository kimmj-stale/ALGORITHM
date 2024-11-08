/* 백준 2309 - 일곱 난쟁이
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int sum;
    static int[] table , release;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        table = new int[9];
        sum = 0;
        for (int i = 0; i < 9; i++) {
            table[i] = Integer.parseInt(br.readLine());
            sum += table[i];
        }
        Arrays.sort(table);

        release = search();

        for (int i = 0; i < 9; i++) {
            if ( i != release[0] && i != release[1]) {
                System.out.println(table[i]);
            }
        }
    }
    static int[] search() {
        for (int i = 0; i < table.length - 1; i++) {
            for (int j = i + 1; j < table.length; j++) {
                if (sum - table[i] - table[j] == 100) {
                    return new int[] {i , j};
                }
            }
        }
        return new int[] {0 , 0};
    }
}
 */

/* sw expert 1859 - 백만장자 프로젝트
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int T , N , cnt;
    static long max , sell , buy;
    static int[] table;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        sell = 0L;
        buy = 0L;
        cnt = 0;

        for (int i = 0; i < T; i++) {
            max = Long.MIN_VALUE;
            N = Integer.parseInt(br.readLine());
            table = new int[N + 1];
            sell = 0;
            st = new StringTokenizer(br.readLine() , " ");
            table[0] = 0;
            for (int j = 1; j <= N; j++) {
                table[j] = Integer.parseInt(st.nextToken());
            }
            sell_in_time();
            System.out.print("#" + (i + 1) +" ");
            System.out.println(sell);
        }

    }
    static void sell_in_time() {
        for (int i = N; i >= 0; i--) {
            if (max < table[i] || i == 0) {
                //뒤부터 생각하면 최대 가격이 올 때 판매해버리면 됨
                //최댓값이 변경된 경우 -> 매수 타이밍
                //매수한 횟수 * 최대 가격 - 여태 산 가격
                sell += max * cnt - buy;
                max = table[i];
                //최댓값이 갱신되었으므로 초기화
                buy = 0;
                cnt = 0;
            }
            else {
                //구매한 만큼 더해놓기
                buy += table[i];
                cnt++;
            }
        }
    }
}
 */

/* sw expert 1926 - 간단한 369게임
import java.io.*;

public class Main {
    static int n , cnt;
    static String ans;
    static char at;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (find369(i) > 0) {
                for (int j = 0; j < find369(i); j++) {
                    sb.append("-");
                }
            } else {
                sb.append(i);
            }

            if (i != n) sb.append(" ");
        }
        bw.write(sb + "");
        bw.flush();
        bw.close();
    }
    static int find369(int k) {
        ans = Integer.toString(k);
        cnt = 0;
        for (int i = 0; i < ans.length(); i++) {
            at = ans.charAt(i);
            if (at == '3' || at == '6' || at == '9') {
                cnt++;
            }
        }
        return cnt;
    }
}
 */