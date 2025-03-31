import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int val = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b + "\n");
        }


        //스트림을 flush 해주어야 한다. 이는 java의 IOStream 규칙으로 해당 OutputStream의 모든 체인을 flush 해주어야 한다.
        //남은 데이터를 모두 출력해주어야 하기 때문에 flush를 하지 않는다 -> 버퍼를 잡아놓았으므로 한 번 스트림을 비워내는 flush 함수가 필요
        //즉 , flush 메서드는 다 차지 않은 버퍼를 강제저그로 비워주는 역할을 함
        bw.flush();
        br.close();
        bw.close();
    }
}