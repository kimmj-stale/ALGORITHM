/* 1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] array;
    public static int n;
    public static int call_F;
    public static int call_f;
    public static void Fibonacci(int[] array , int n) {
        array[1] = array[2] = 1;
        for (int i = 3; i <= n; i++) {
            array[i] = array[i - 2] + array[i - 1];
            call_F++;
        }
    }

    public static int Fib(int n) {
        if (n == 1 || n == 2) {
            call_f++;
            return 1;
        }
        else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        array = new int[n + 1];

        Fibonacci(array , n);
        int ans2 = Fib(n);

        System.out.println(call_f + " " + call_F);
    }
}
 */