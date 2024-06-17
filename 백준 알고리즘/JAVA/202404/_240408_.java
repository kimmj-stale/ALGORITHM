/*1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[] sort;

    public static void s_num(String s) {
        sort_num(s , s.length());
    }

    private static void sort_num(String s , int len) {
        sort = new int[11];
        
        for (int i = 0; i < len; i++) {
            int n = s.charAt(i) - 48;
            sort[n]++;
        }
    }

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         String num = br.readLine();
         s_num(num);
         
         for (int i = 10; i >= 0; i--) {
             if (sort[i] != 0) {
                 for (int j = 0; j < sort[i]; j++) {
                     System.out.print(i);
                 }
             }
         }
     }
}
 */

/*2
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() , " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr , (e1 , e2) -> {
            if (e1[0] == e2[0]) {
                //두 수를 비교하는 과정에서 e1[0] - e2[0]을 통해 음수인 경우 , 0인 경우 , 양수인 경우를 나누어 정렬
                //이 과정을 이용하면 음수인 경우를 포함하여 정렬이 가능하다.
                return e1[1] - e2[1];
            }
            else {
                //두 수가 다르다면 비교가 가능하므로 정렬 가능하다.
                return e1[0] - e2[0];
            }
        });
        for (int i = 0; i < n; i++) {
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
 */

