/* 재귀 - 신나는 함수 실행
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][][] data_sheet = new int[21][21][21];
    static void print_ans(int a , int b , int c , int ans) {
        System.out.printf("w(%d, %d, %d) = %d\n" , a , b , c , ans);
    }
    static int w_function(int a , int b , int c) {
        if (a <= 0 || b <= 0 || c <= 0) return 1;
        if (a > 20 || b > 20 || c > 20) return data_sheet[20][20][20] = w_function(20 , 20 , 20);

        if (data_sheet[a][b][c] != 0) return data_sheet[a][b][c];
        if (a < b && b < c) {
            data_sheet[a][b][c] = w_function(a, b, c-1) + w_function(a, b-1, c-1) - w_function(a, b-1, c);
            return data_sheet[a][b][c];
        }

        data_sheet[a][b][c] =  w_function(a-1, b, c) + w_function(a-1, b-1, c) + w_function(a-1, b, c-1) - w_function(a-1, b-1, c-1);
        return data_sheet[a][b][c];

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine() , " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == -1 &&  b == -1 && c == -1) break;
            print_ans(a , b , c , w_function(a , b , c));
        }
    }
}
 */