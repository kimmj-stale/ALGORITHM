/* Circular linked list 예제 1
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        //queue 샹성
        //데이터 값 저장 장소 설정
        Queue<Integer> Q_table = new LinkedList<>();
        //poll 로 빼낸 data 저장 장소 설정
        Queue<Integer> ans = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            Q_table.offer(i);
        }
        //1 2 3 4 5 6 7
        int idx = 0;
        while (true) {
            if (ans.size() == n) break;
            ++idx;
            if (idx == k) {
                ans.offer(Q_table.peek());
                Q_table.poll();
                idx = 0;
            }
            else {
                Q_table.offer(Q_table.peek());
                Q_table.poll();
            }
        }
        sb.append("<");
        while (true) {
            if (ans.peek() != null) {
                sb.append(ans.peek());
            }
            ans.poll();
            if (ans.isEmpty()) {
                break;
            }
            else sb.append(", ");
        }

        sb.append(">");
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */

/*deque 예제1
import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> table = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() , " ");
            int command = Integer.parseInt(st.nextToken());
            switch (command) {
                case 1:
                    int data1 = Integer.parseInt(st.nextToken());
                    table.offerFirst(data1);
                    break;
                case 2:
                    int data2 = Integer.parseInt(st.nextToken());
                    table.offerLast(data2);
                    break;
                case 3:
                    if (!table.isEmpty()) sb.append(table.poll()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case 4:
                    if (!table.isEmpty()) sb.append(table.pollLast()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case 5:
                    sb.append(table.size()).append("\n");
                    break;
                case 6:
                    if (!table.isEmpty()) sb.append(0).append("\n");
                    else sb.append(1).append("\n");
                    break;
                case 7:
                    if (!table.isEmpty()) sb.append(table.peekFirst()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case 8:
                    if (!table.isEmpty()) sb.append(table.peekLast()).append("\n");
                    else sb.append(-1).append("\n");
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