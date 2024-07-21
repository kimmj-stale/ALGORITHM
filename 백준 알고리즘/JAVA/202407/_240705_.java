/*1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static void cont(int n1 , int n2) {
        if (n1 > n2) System.out.println(">");
        else if (n1 == n2) System.out.println("=");
        else System.out.println("<");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            int s1 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());
            System.out.print("#" + i + " ");
            cont(s1 , s2);
        }
    }
}
 */

/*2
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            int max_num = 0;
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < 10; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num > max_num) max_num = num;
            }
            System.out.print("#" + i + " ");
            System.out.println(max_num);
        }
    }
}
 */