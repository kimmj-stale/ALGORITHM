/*Queue 예제1
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> Q_table = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int last = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() , " ");
            String command = st.nextToken();
            if (command.equals("push")) {
                int data = Integer.parseInt(st.nextToken());
                last = data;
                Q_table.offer(data);
            }
            else if (command.equals("pop")) {
                if (!Q_table.isEmpty()) {
                    sb.append(Q_table.peek()).append("\n");
                    Q_table.poll();
                }
                else sb.append(-1).append("\n");
            }
            else if (command.equals("size")) sb.append(Q_table.size()).append("\n");
            else if (command.equals("empty")) {
                if (Q_table.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            else if (command.equals("front")) {
                if (Q_table.isEmpty()) sb.append(-1).append("\n");
                else sb.append(Q_table.peek()).append("\n");
            }
            else if (command.equals("back")) {
                if (Q_table.isEmpty()) sb.append(-1).append("\n");
                else {
                    sb.append(last).append("\n");
                }
            }
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */

/* Queue 2
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> table = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            table.offer(i);
        }
        while (table.size() != 1) {
            table.poll();
            int num = table.peek();
            table.poll();
            table.offer(num);
        }
        int ans = table.peek();
        bw.write(String.valueOf(ans));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */