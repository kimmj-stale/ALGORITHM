import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine() , " ");
        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        //더한 수들을 저장한 배열
        int min_val = -10000001;
        int sum_s = 0;

        if (n == k) min_val = arr[n - 1];
        else {
            for (int i = k; i < n; i++) {

                if (i == k) sum_s = arr[i - 1];
                else sum_s = arr[i] - arr[i - k];

                if (min_val < sum_s) min_val = sum_s;
            }
        }
        System.out.println(min_val);
    }
}