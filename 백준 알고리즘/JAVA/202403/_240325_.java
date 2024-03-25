/*1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 뱐수 설정
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        boolean ans = true;
        for (int i = n0; i < 101; i++) {
            if (a1 * i + a0 <= c * i) {
                ans = true;
            }
            else {
                ans = false;
                break;
            }
        }

        if (ans == true) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
 */

/*2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        int max_sum = 0;
        for (int i = 0; i < n; i++) {
            int input_num = sc.nextInt();
            arr[i] = input_num;
        }
        int sum = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] <= m) {
                        if (arr[i] + arr[j] + arr[k] >= max_sum) {
                            max_sum = arr[i] + arr[j] + arr[k];
                        }
                    }
                }
            }
        }
        System.out.println(max_sum);
    }
}
 */
