/*1
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        닫힌 창문은 2가지 유형이 있다.
        소수 - 2 3 5 7 11 13 17 23
        최소공배수 -
        수 자신

        +)
        1은 무조건 열려 있다.
        소수들은 무조건 닫혀있다.

        따라서, 주어진 수 이하의 거듭 제곱수의 갯수를 구하면 된다.
int num = Integer.parseInt(br.readLine());
int count = 0;
        for (int i = 1; i * i <= num; i++) {
count++;
        }
        bw.write(count + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
 */

/*2 Stack
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> table = new Stack<>();

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() , " ");
            int btn = Integer.parseInt(st.nextToken());
            switch (btn) {
                case 1:
                    int push_num = Integer.parseInt(st.nextToken());
                    table.push(push_num);
                    break;
                case 2:
                    if (table.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else {
                        sb.append(table.peek()).append("\n");
                        table.pop();
                    }
                    break;
                case 3:
                    sb.append(table.size()).append("\n");
                    break;
                case 4:
                    if (table.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case 5:
                    if (table.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else {
                        sb.append(table.peek()).append("\n");
                    }
                    break;
            }
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */