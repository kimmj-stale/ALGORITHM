/* 백준 11286 - 절잿값 힙
import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((x , y) -> {
            if (Math.abs(x) == Math.abs(y)) return x - y;
            else return Math.abs(x) - Math.abs(y);
        });
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (pq.isEmpty()) sb.append(0 + "\n");
                else sb.append(pq.poll() + "\n");
            } else {
                pq.add(num);
            }
        }

        bw.write(sb + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */