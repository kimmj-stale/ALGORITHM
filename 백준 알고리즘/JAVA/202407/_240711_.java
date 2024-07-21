/*1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] table = new int[n];
        st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < n; i++) {
            table[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(table);
        System.out.println(table[n / 2]);
    }
}
 */

/* 2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        int ans = 0;
        for (int i = 0; i < num.length(); i++) {
            int div = num.charAt(i) - 48;
            ans += div;
        }
        System.out.println(ans);
    }
}
 */