/* 백준 11279 - 최대 힙
import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        //우선순위 큐(Priority Queue) 사용
        //기본적으로 작은 수 먼저 반환하도록 구성되어 있음
        //Collections.reverseOrder()을 사용하면 정렬 방식을 큰 수 우선으로 저장
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            //받은 수가 0 이다 -> 여태 받은 값을 큰 수 먼저 반환한다.
            //              -> 여태 받은 수가 없다면 0 을 반환한다.
            if (m == 0) {
                if (pq.isEmpty()) sb.append(0);
                else sb.append(pq.poll());
                sb.append("\n");
            } else {
                pq.add(m);
            }
        }
        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */

/* 백준 1927 - 최소 힙 복습
import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        //우선순위 큐(Priority Queue) 사용
        //기본적으로 작은 수 먼저 반환하도록 구성되어 있음
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            //받은 수가 0 이다 -> 여태 받은 값을 큰 수 먼저 반환한다.
            //              -> 여태 받은 수가 없다면 0 을 반환한다.
            if (m == 0) {
                if (pq.isEmpty()) sb.append(0);
                else sb.append(pq.poll());
                sb.append("\n");
            } else {
                pq.add(m);
            }
        }
        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */

/* 백준 11286 - 절잿값 힙 복습
import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        //lambda 식을 이용해 정렬 방식 구현
        PriorityQueue<Integer> pq = new PriorityQueue<>((x , y) -> {
            if (Math.abs(x) == Math.abs(y)) return x - y;
            else return Math.abs(x) - Math.abs(y);
        });

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            if (m == 0) {
                if (pq.isEmpty()) sb.append(0);
                else sb.append(pq.poll());
                sb.append("\n");
            } else {
                pq.add(m);
            }
        }

        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */