/*1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int f_num = s.charAt(i);

            if (f_num >= 65 && f_num <= 67) {
                sum += 3;
            }
            if (f_num >= 68 && f_num <= 70) {
                sum += 4;
            }
            if (f_num >= 71 && f_num <= 73) {
                sum += 5;
            }
            if (f_num >= 74 && f_num <= 76) {
                sum += 6;
            }
            if (f_num >= 77 && f_num <= 79) {
                sum += 7;
            }
            if (f_num >= 80 && f_num <= 83) {
                sum += 8;
            }
            if (f_num >= 84 && f_num <= 86) {
                sum += 9;
            }
            if (f_num >= 87 && f_num <= 90) {
                sum += 10;
            }
        }
        System.out.println(sum);
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
        int arr1[][] = new int[n][m];
        int arr2[][] = new int[n][m];
        int ans[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int ele = sc.nextInt();
                arr1[i][j] = ele;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int ele = sc.nextInt();
                arr2[i][j] = ele;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i][0] + arr2[i][0]);
            for (int j = 1; j < m; j++) {
                System.out.print(" ");
                System.out.print(arr1[i][j] + arr2[i][j]);
            }
            System.out.println();
        }
    }
}
 */

/*3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int column = 0;
        int row = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int a = sc.nextInt();
                if (a > max) {
                    max = a;
                    column = i;
                    row = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(column + " " + row);
    }
}
 */

/*4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_index = 0;
        char arr[] = new char[75];
        for (int i = 0; i < 75; i++) {
            arr[i] = ' ';
        }
        for (int i = 0; i < 5; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                arr[i + j * 5] = s.charAt(j);
            }
        }
        for (int i = 0; i < 75; i++) {
            if (arr[i] != ' ') {
                System.out.print(arr[i]);
            }
        }
    }
}
 */