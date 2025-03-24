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