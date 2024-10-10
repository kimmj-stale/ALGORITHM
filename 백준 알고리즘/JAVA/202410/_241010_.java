/* 백준 1912 - 복습
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n , sum = 0 , MAX = -1000;
    static int[] data_sheet;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        data_sheet = new int[n];
        st = new StringTokenizer(br.readLine() , " ");
        //배열에 받은 data값을 저장
        for (int i = 0; i < n; i++) {
            data_sheet[i] = Integer.parseInt(st.nextToken());
        }

        //배열에 받은 값을 이용하여 최댓값 판별
        //값을 하나씩 더하는 경우 - 더할 때 음수가 나오는 경우 - 0으로 리셋
        //값을 하나씩 더하는 경우 - 더할 때 양수가 나온다면 최댓값을 설정하여 for문 반복마다 새로 갱신
        for (int val : data_sheet) {
            if (sum + val > 0) {
                //첫 번째 val 값 = val + 0 -> 다음 val값으로 지정 -> sum = val
                //두번째 val 값 = val + 첫번째 val값 = sum값
                //값을 더하다가 음수가 나온다 = 0으로 초기화
                val += sum;
                sum = val;
            }
            else sum = 0;
            //매번 연산마다 최댓값을 갱신, 그 최댓값이 구간합 중 가장 큰 값
            if (MAX < val) MAX = val;
        }

        bw.write(MAX + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
 */