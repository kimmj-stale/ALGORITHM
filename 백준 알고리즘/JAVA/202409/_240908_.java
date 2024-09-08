/* 별찍기 - 10 복습
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                int temp_Row = x;
                int temp_Column = y;
                int temp_N = n;
                //3으로 나눈 후 나머지가 1인 좌표는 무조건 공백
                if (temp_Row % 3 == 1 && temp_Column % 3 == 1) {
                    sb.append(" ");
                } else {
                    while (true) {
                        temp_Row %= temp_N;
                        temp_Column %= temp_N;
                        //무조건 공백이 아닌 구역 설정
                        temp_N/= 3;
                        if (temp_Row < 3 || temp_Column < 3) {
                            sb.append("*");
                            break;
                        }
                        //범위 지정하기
                        //1 ~ 1
                        //3 ~ 5
                        //9 ~ 17
                        //.....
                        if ((temp_Row >= temp_N && temp_Row <= temp_N * 2 - 1) && (temp_Column >= temp_N && temp_Column <= temp_N * 2 - 1)) {
                            sb.append(' ');
                            break;
                        }
                    }
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
 */