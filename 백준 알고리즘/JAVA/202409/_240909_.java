/* 하노이 탑 - 개쩌는 풀이
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();
    public static void Hanoi(int n , int from , int station , int to) {
        cnt++;
        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }
        Hanoi(n - 1 , from , to , station);
        sb.append(from).append(" ").append(to).append("\n");
        Hanoi(n - 1 , station , from , to);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Hanoi(n , 1 , 2 , 3);

        System.out.println(cnt + "\n" + sb);
    }
}
 */
