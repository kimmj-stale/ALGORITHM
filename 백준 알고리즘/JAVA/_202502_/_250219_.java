/* 2447
import java.io.*;

public class Main {
    public static String[][] star;
    static void set_void(int st_x , int st_y , int space) {
        for (int i = st_x; i < st_x + space; i++) {
            for (int j = st_y; j < st_y + space; j++) {
                star[i][j] = " ";
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int jump_st , init_st , null_st;
        star = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                star[i][j] = "*";
            }
        }

        //3x3 환경에서 (1 , 1) / 9x9 환경에서 (3 ~ 5 , 3 ~ 5) + (1 += 3 , 1 += 3)
        //n == 9 인 경우 시작 좌표 init_st , 건너뛰는 크기 jump_st , 비우는 칸의 크기 null_st
        //만일 init_st + jump_st 값이 n을 넘으면 종료
        //시간 복잡도 (log^3(n))^3 * (n / 3)^2 - 최악의 경우
        for (int i = 1; i <= n; i *= 3) { // n = 3^k 인 경우 시간 복잡도 가산 k번
            jump_st = i * 3;
            init_st = i;
            for (int j = init_st; j < n; j += jump_st) {
                for (int k = init_st; k < n; k += jump_st) {
                    set_void(j , k , i);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(star[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
 */
