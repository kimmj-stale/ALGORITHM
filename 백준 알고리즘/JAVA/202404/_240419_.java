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

        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        
        int s1_count = Integer.parseInt(st.nextToken());
        int s2_count = Integer.parseInt(st.nextToken());
        //hash 생성
        HashMap<Integer , Integer> table = new HashMap<Integer , Integer>();
        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < s1_count; i++) {
            int val = Integer.parseInt(st.nextToken());
            table.put(val , 1);
        }
        st = new StringTokenizer(br.readLine() , " ");
        int sum = s1_count + s2_count;
        for (int i = 0; i < s2_count; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (table.containsKey(val)) {
                sum -= 2;
            }
        }
        bw.write(sum + "");
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
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String , Integer> table = new HashMap<String , Integer>();
        String s = br.readLine();
        int total = s.length();
        for (int i = 1; i <= s.length(); i++) {
            total += i;
        }
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                String val = s.substring(i , j);
                if (!table.containsKey(val)) {
                    table.put(val , 0);
                }
                else {
                    total--;
                }
            }
        }
        bw.write(total + "");
        bw.flush();
        bw.close();
    }
}
 */
