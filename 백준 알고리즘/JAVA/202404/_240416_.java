/*1
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        //구현부 설정
        Map<Integer , Integer> mapping = new HashMap<>();
        int n1 = sc.nextInt();
        int[] arr_s = new int[n1];
        for (int i = 0; i < n1; i++) {
            int val = sc.nextInt();
            mapping.put(val , 1);
        }

        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            int val1 = sc.nextInt();
            if (mapping.containsKey(val1)) {
                sb.append(1).append(" ");
            }
            else {
                sb.append(0).append(" ");
            }
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
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        //갯수 확인하기
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        Map<String , Integer> Stringmap = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            String s1 = br.readLine();
            Stringmap.put(s1 , 1);
        }
        for (int i = 0; i < n2; i++) {
            String s2 = br.readLine();
            if (Stringmap.containsKey(s2)) {
                sum += Stringmap.get(s2);
            }
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}
 */