/*1
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int data_count = Integer.parseInt(br.readLine());
        HashMap<Integer , Integer> table = new HashMap<Integer , Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < data_count; i++) {
            int val = Integer.parseInt(st.nextToken());
            table.put(val , table.getOrDefault(val , 0) + 1);
        }
        int pivot_count = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < pivot_count; i++) {
            int piv = Integer.parseInt(st.nextToken());
            sb.append(table.getOrDefault(piv , 0)).append(" ");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
 */

/*2
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        int n_hear = Integer.parseInt(st.nextToken());
        int n_look = Integer.parseInt(st.nextToken());
        HashMap<String , Integer> table = new HashMap<String , Integer>();
        for (int i = 0; i < n_hear; i++) {
            String name = br.readLine();
            table.put(name , 0);
        }
        int sum = 0;
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < n_look; i++) {
            String name = br.readLine();
            if (table.containsKey(name)) {
                ans.add(name);
                sum++;
            }
        }
        Collections.sort(ans);

        bw.write(sum + "\n");
        for (int i = 0; i < ans.size(); i++) {
            bw.write(ans.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
 */