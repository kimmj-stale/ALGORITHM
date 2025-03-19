import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        //Hash map에 담는 이유
            //hash map의 탐색 알고리즘은 merge sort보다 좋은 알고리즘을 사용하므로 map을 사용하는 편이 좋다.
        Map<Integer , Integer> comp = new HashMap<>();
        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            comp.put(Integer.parseInt(st.nextToken()) , 0);
        }

        int m = Integer.parseInt(br.readLine());
        int val;
        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < m; i++) {
            val = Integer.parseInt(st.nextToken());
            if (comp.containsKey(val)) bw.write(1 + "\n");
            else bw.write(0 + "\n");
        }

        //StringBuilder에 담아서 출력하는 경우가 더 느림
        bw.flush();
        br.close();
        bw.close();
    }
}