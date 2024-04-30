/*1
import java.io.*;

public class Main {
    //is_prime 알고리즘
    //모든 수는 루트 n을 기준으로 좌/우 대칭적인 구조를 가진다.
    //따라서 루트 n을 기준으로 왼쪽에 있는 수가 약수라면 오른쪽에 있는 수에도 약수가 존재한다
    public static Boolean is_prime(long a) {
        Boolean ans = true;
        if (a < 2) {
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    ans = false;
                    break;
                }
                else {
                    ans = true;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            long table = Long.parseLong(br.readLine());
            while (true) {
                if (is_prime(table)) {
                    sb.append(table).append("\n");
                    break;
                }
                table++;
            }
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */

/*2
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static Boolean is_Prime(int a) {
        if (a < 2) {
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        int first = Integer.parseInt(st.nextToken());
        int last = Integer.parseInt(st.nextToken());
        for (int i = first; i <= last; i++) {
            if (is_Prime(i)) {
                sb.append(i).append("\n");
            }
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */
