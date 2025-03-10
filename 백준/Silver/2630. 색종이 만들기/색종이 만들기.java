import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n , blue , white;
    static int[][] table;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        table = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < n; j++) {
                table[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //시작 좌표 (0 , 0)
        splitSquare(0 , 0 , n);
        bw.write(white + "\n" + blue);
        bw.flush();
        br.close();
        bw.close();
    }
    static void splitSquare(int x , int y , int div) {
        int sum = 0;
        for (int i = x; i < x + div; i++) {
            for (int j = y; j < y + div; j++) {
                sum += table[i][j];
            }
        }

        if (sum == div * div) blue++;
        else if (sum == 0) white++;
        else {
            div /= 2;
            //색종이를 나눌 때 만일 나눠지지 않아도 되는 경우가 존재
                //-> 색종이를 더 이상 나누지 않고 div x div 의 정사각형 색종이가 완성된 경우
                //해당 구역은 연산 종료
            //더 나눠야 하는 경우 -> div x div != 해당 범위의 값을 모두 더한 값
            splitSquare(x , y , div);
            splitSquare(x , y + div , div);
            splitSquare(x + div , y , div);
            splitSquare(x + div , y + div , div);
        }
    }
}