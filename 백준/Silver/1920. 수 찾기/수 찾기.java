//hash map을 쓰는 방식이 더 효율적으로 빠름
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int n , m;
    static Map<Integer , Integer> comp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        n = Integer.parseInt(br.readLine());
        comp = new HashMap<>();
        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            comp.put(Integer.parseInt(st.nextToken()) , 0);
        }

        m = Integer.parseInt(br.readLine());
        int val = 0;
        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < m; i++) {
            val = Integer.parseInt(st.nextToken());
            if (comp.containsKey(val)) bw.write(1 + "\n");
            else bw.write(0 + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}