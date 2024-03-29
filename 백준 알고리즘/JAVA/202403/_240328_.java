/*1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int ans_six = sc.nextInt();
        int first_index_of_six = 0;
        int last_index_of_six = 0;
        StringBuffer sb = new StringBuffer();

        for (int i = 666; i < 50000000; i++) {
            String st_i = String.valueOf(i);
            for (int j = 0; j < st_i.length(); j++) {
                if (j < st_i.length() - 2) {
                    if (st_i.charAt(j) == '6' && st_i.charAt(j + 1) == '6' && st_i.charAt(j + 2) == '6') {
                        count++;
                        break;
                    }
                }
            }
            if (count == ans_six) {
                System.out.println(i);
                break;
            }
        }
    }
}
 */

/*2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sugar_n = sc.nextInt();
        int least = 3001;
        for (int x = 0; x < 2000; x++) {
            for (int y = 0; y < 1001; y++) {
                if (3 * x + 5 * y == sugar_n) {
                    if (least >= x + y) {
                        least = x + y;
                    }
                }
            }
        }
        if (least == 3001) {
            System.out.println(-1);
        }
        else {
            System.out.println(least);
        }
    }
}
 */

/*3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[1001];
        int arr2[] = new int[1001];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num >= 0) {
                arr1[num]++;
            }
            else {
                arr2[-num]++;
            }
        }
        for (int i = 1000; i >= 1; i--) {
            if (arr2[i] != 0) {
                System.out.println(-i);
            }
        }
        for (int i = 0; i < 1001; i++) {
            if (arr1[i] != 0) {
                System.out.println(i);
            }
        }
    }
}
 */

/*4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[101];
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            arr[num]++;
        }
        for (int i = 10; i <= 100; i += 10) {
            if (arr[i] != 0) {
                sum += i * arr[i];
            }
        }
        System.out.println(sum / 5);

        for (int i = 10; i <= 100; i += 10) {
            ans += arr[i];
            if (ans >= 3) {
                System.out.println(i);
                break;
            }
        }
    }
}
 */