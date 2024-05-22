/*1 골드바흐 추측 예제
import java.io.*;
import java.util.Arrays;

public class Main {
    public static int div_ans(int a , int[] array) {
        int div1 = a / 2;
        int div2 = a / 2;
        int ans = 0;
        while (true) {
            if (div1 == 1) break;
            if (array[div1] == 1 && array[div2] == 1) {
                ans++;
            }
            div1--;
            div2++;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //SieveOfEratos (에라토스테네스의 체)
        int MAX_NUM = 1000000;
        int[] Eratos = new int[MAX_NUM + 1];
        Arrays.fill(Eratos , 1);
        //0과 1은 소수가 아니므로 미리 제외
        Eratos[0] = Eratos[1] = 0;
        for (int i = 2; i * i <= MAX_NUM; i++) {
            if (Eratos[i] == 1) {
                for (int j = i * i; j <= MAX_NUM; j += i) {
                    Eratos[j] = 0;
                }
            }
        }
        //수 받기
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            int ans = div_ans(num , Eratos);
            sb.append(ans).append("\n");
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */
