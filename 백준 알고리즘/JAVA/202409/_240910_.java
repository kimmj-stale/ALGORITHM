/* 하노이 탑 복습
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();
    //1번을 시작점 , 2번을 중간에 잠시 거치는 곳 , 3번을 최종 도착지로 설정하여 항상 3에 모두 모이도록 설정
    public static void Hanoi(int n , int from , int station , int to) {
        cnt++;
        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }
        // !!!!!    조립은 분해의 역순이다     !!!!
        //모든 과정은 가장 밑의 큰 판이 3번으로 이동하는 과정이 필요하다.
        //해당 과정은 가장 처음 나온 1 -> 3 과정이 이루어진다.
        //중간 1 -> 3 과정이 끝나면 해체했던 과정의 역순으로 출력한다.

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
