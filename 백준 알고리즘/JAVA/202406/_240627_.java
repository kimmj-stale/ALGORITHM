/* Scanner 사용 예제1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            System.out.println(word);
        }
        sc.close();
    }
}
 */

/* 배열을 이용한 단위 면적 합 2
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] table = new int[100][100];
        int ans = 0;
        //단위 면적 1 로 나눠서 생각하기
        //길이를 1씩 나눠서 분리한 후 배열에 배치 (100 X 100 칸으로 나눠진 큰 상자를 (x1 , x2)의 좌표에 1을 하나씩 채운다고 생각
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            for (int j = x1; j < x1 + 10; j++) {
                for (int k = x2; k < x2 + 10; k++) {
                    table[j][k] = 1;
                }
            }
        }
        //칸에 1로 채워진 칸의 갯수를 구하기 = 넓이
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (table[i][j] == 1) ans++;
            }
        }
        br.close();
        bw.write(ans + "");
        bw.flush();
        bw.close();
    }
}
 */
