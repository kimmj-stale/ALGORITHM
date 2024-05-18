/*
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int[] table;
    public static void Fibo() {
        int f_num = 0;
        int idx_num = 1;

        table = new int[21];
        table[0] = 0;
        table[1] = 1;
        for (int i = 2; i <= 20; i++) {
            table[i] = f_num + idx_num;

            f_num = idx_num;
            idx_num = table[i];
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Fibo();
        System.out.println(table[n]);
    }
}
 */
