/*백준 1912 : 처음 생각한 틀린 코드 - 메모리 초과
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] sum_data;
    static int[][] data_sheet;
    static int n , sum = 0, sum_max_result = -500501;
    static void input_num(StringTokenizer st) {
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
            sum_data[i] = sum;
        }
    }
    static void search_summationMAX() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) data_sheet[i][j] = sum_data[i];
                else data_sheet[i][j] = sum_data[i] - sum_data[j];
                if (sum_max_result < data_sheet[i][j]) sum_max_result = data_sheet[i][j];
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        sum_data = new int[n];
        data_sheet = new int[n][n];
        sum = 0;
        st = new StringTokenizer(br.readLine() , " ");
        //index 1 ~ n 까지의 숫자를 더한 값을 저장
        input_num(st);
        search_summationMAX();
        System.out.println(sum_max_result);
        br.close();
    }
}
 */

/*백준 1912 :
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] data_sheet;
    static int sum = 0 , Max = -1000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine() , " ");
        data_sheet = new int[n];
        for (int i = 0; i < n; i++) {
            data_sheet[i] = Integer.parseInt(st.nextToken());
        }
        sum = 0;

        for (int val : data_sheet) {
            if (sum + val > 0) {
                val += sum;
                sum = val;
            }
            else sum = 0;

            if (Max < val) Max = val;
        }
        bw.write(Max + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
 */
