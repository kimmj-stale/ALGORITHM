/* 백준 10830 - 행렬 제곱 복습
import java.io.*;
import java.util.StringTokenizer;

//행렬 제곱의 제곱근 수가 1000억을 넘어감
//행렬 a에 대하여 a^b = a^(b / 2) * a^(b / 2) 임을 이용
//지수 b가 홀수인 경우 짝수로 변환
//1000보다 큰 수는 나머지로 계산 , 자료형을 int로 해도 상관없음 , b는 long 자료형으로 접근
public class Main {
    static int n;
    static long b;
    static int[][] table , ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        b = Long.parseLong(st.nextToken());
        table = new int[n][n];

        for (int i = 0; i < n; i++) {
            //입력수는 무조건 1000 이하의 자연수
            st = new StringTokenizer(br.readLine() , " ");
            for (int j = 0; j < n; j++) {
                table[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        ans = division(table , b);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //division 함수에서 cnt = 1이라 배열값을 결과로 갖는 함수가 존재하므로 1000으로 나눈 나머지 값을 넣어야 한다.
                sb.append(ans[i][j] % 1000);
                if (j == n - 1) sb.append("\n");
                else sb.append(" ");
            }
        }
        bw.write(sb + "");
        bw.flush();
        bw.close();
        br.close();

    }
    static int[][] division(int[][] arr , long cnt) {
        //재귀를 지속하다가 cnt가 1이 되면 초기 배열값(table)과 동일하도록 리턴
        if (cnt == 1L) return arr;
        int[][] div = division(arr , cnt / 2);
        //둘 씩 합쳐나가면서 합성 (b를 2로 나눈 횟수만큼 지속)
        div = arrayMultiply(div , div);
        //b가 홀수라면 초기 배열 값을 곱함
        if (cnt % 2 != 0L) div = arrayMultiply(div , arr);

        return div;
    }
    static int[][] arrayMultiply(int[][] arr1 , int[][] arr2) {
        int[][] sub = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    sub[i][j] += arr1[i][k] * arr2[k][j];
                }
                sub[i][j] %= 1000;
            }
        }
        return sub;
    }
}
 */