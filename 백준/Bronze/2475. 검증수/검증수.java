import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            //java Math의 메서드인 Math.pow()를 써도 되지만 리턴 형식이 double 이라 사용하기 불편함
            //인수 하나 더 호출하는 쪽이 느림(108ms) , Math 메서드 사용하는 편이 더 좋음(104ms)
            sum += (int) Math.pow(Integer.parseInt(st.nextToken()) , 2);
        }
        bw.write(sum % 10 + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
