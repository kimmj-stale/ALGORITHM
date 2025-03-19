//getOrDefault 메서드를 잘 사용해야 한다.
    //hash map 에서 value값이 존재하면 그 값을 출력
    //없다면 default 값으로 정한 값을 출력

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int n , m;
    static Map<Integer , Integer> comp_Table;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine() , " ");
        int val;
        comp_Table = new HashMap<>();
        for (int i = 0; i < n; i++) {
            //hash map 으로 받은 값의 갯수를 판단
                //만일 map에 넣은 값이 이미 넣었던 값이라면 이전 값 + 1
                //아니라면 default value가 0이므로 0 + 1 = 1
            val = Integer.parseInt(st.nextToken());
            comp_Table.put(val , comp_Table.getOrDefault(val , 0) + 1);
        }

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < m; i++) {
            //해당 배열에 존재하는 수 라면 value 값 출력 , 아니라면 0을 출력
            bw.write(comp_Table.getOrDefault(Integer.parseInt(st.nextToken()) , 0) + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}