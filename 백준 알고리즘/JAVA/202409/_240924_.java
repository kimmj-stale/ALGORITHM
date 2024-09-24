/* n-queen
import java.io.*;

public class Main {
    static int n , ans , arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        ans = 0;
        //1 ~ n까지 저장
        arr = new int[n + 1];

        setQueen(1);

        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }

    public static void setQueen(int k) {
        //1, 일직선 혹은 대각선 상에 존재하는 지 확인
        if (!settingCheck(k - 1)) return;
        //2, 탐색 가능한 위치를 모두 탐색했을 경우
        if (k > n) {
            ans++;
            return;
        }
        //가능한 위치 정하기 - k행의 i열에 queen을 두겠다.
        //다음 행인 k + 1행에 두는 경우를 생각 - 재귀로 설정하여 1, 2의 경우를 모두 통과하는지
        for (int i = 1; i <= n; i++) {
            arr[k] = i;
            setQueen(k + 1);
        }
    }

    public static boolean settingCheck(int k) {
        //1, arr[i] == arr[k]인 경우 - 동일 열에 존재하는 경우 이므로 둘 수 없는 위치이다.
        //2, k - i == |arr[k] - arr[i]|인 경우 대각선 상에 위치하는 것이므로 둘 수 없는 위치이다.
        //1, 2를 만족하지 않는다면 true로 출력, setQueen의 1번을 통과할 수 있다.
        for (int i = 1; i < k; i++) {
            if (arr[i] == arr[k] || k - i == Math.abs(arr[k] - arr[i])) return false;
        }
        return true;
    }
}
 */

/* 다른 풀이
import java.io.*;

public class Main {
    static int n , ans , arr[];
    static boolean horizonCheck[] , LdiagonalCheck[] , RdiagonalCheck[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        horizonCheck = new boolean[n + 1];
        LdiagonalCheck = new boolean[2 * n + 1];
        RdiagonalCheck = new boolean[2 * n];

        setQueen(1);

        bw.write(ans + "");
        bw.flush();
        br.close();
        bw.close();
    }
    public static void setQueen(int k) {
        if (k > n) {
            ans++;
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (horizonCheck[i]) continue;
            if (RdiagonalCheck[k - i + n]) continue;
            if (LdiagonalCheck[k + i]) continue;

            horizonCheck[i] = true;
            RdiagonalCheck[k - i + n] = true;
            LdiagonalCheck[k + i] = true;

            setQueen(k + 1) ;

            horizonCheck[i] = false;
            RdiagonalCheck[k - i + n] = false;
            LdiagonalCheck[k+ i] = false;
        }
    }
}
 */