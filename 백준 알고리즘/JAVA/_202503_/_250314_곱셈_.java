//자연수를 여러번 곱하는 경우 사용하는 방식이다.
//여러 자연수를 여러번 곱하게 된다면 횟수에 따라 overflow 가 걸릴 수 있다.
//따라서 곱하는 횟수를 2로 나누는 경우를 구하면 더욱 빠르게 구할 수 있다.
//A 를 B 번 곱한다고 가정할 때,
//A ^ B = (A * A) ^ (B / 2) 와 같음을 구하면 된다.

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static long A , B , C , sum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());


        sum = 1L;
        while (B > 0) {
            if (B % 2 == 1) {
                //B가 홀수인 경우, B - 1로 만들고 결과에 A를 하나 곱해준다.
                //B는 짝수가 되고 결과값에 A하나가 곱해지게 된다.
                //최종적으로 B는 1이 되어 if문 안으로 들어와 결과값을 출력할 수 있게 된다.
                sum = (sum * A) % C;
            }
            //B가 짝수인 경우 A ^ B = (A * A) ^ (B / 2)로 만든다.
            //(A * B) % C = ((A % C) * (B % C)) % C와 같음을 이용한다.
            A = (A * A) % C;
            B /= 2;
        }

        bw.write(sum + "");
        bw.flush();
        br.close();
        bw.close();
    }
}