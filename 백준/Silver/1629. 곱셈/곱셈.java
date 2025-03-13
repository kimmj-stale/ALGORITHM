import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static long sum;
    static long A , B , C;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        bw.write(module(A , B , C) + "");
        bw.flush();
        br.close();
        bw.close();
    }
    static long module(long A , long B , long C) {
        sum = 1L;
        //모듈러 제곱 연산식을 사용하면 많은 시간을 사용하지 않아도 된다.
        //시간 복잡도는 log n 수준으로 줄어든다
        //(A * B) % C = ((A % C) * (B % C)) % C 이용
        //B가 짝수인 경우
            //A = A ^ 2 % C -> 곱해야 하는 수의 제곱을 해준다
                //A 를 B 번 곱한다 == (A * A) 를 B / 2 번 곱한다.
            //B /= 2 후 다음 연산을 진행
        //B가 홀수인 경우
            //결과에 A를 한 번 곱한다
            //B /= 2 후 다음 연산을 진행
        while (B > 0) {
            if (B % 2 == 1) {
                sum = A * sum % C;
            }
            A = A * A % C;
            B /= 2;
        }
        return sum;
    }
}