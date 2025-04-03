import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < n; j++) {
                pQueue.add(Integer.parseInt(st.nextToken()));
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == n - 1) bw.write(pQueue.peek() + "");
            else pQueue.poll();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}