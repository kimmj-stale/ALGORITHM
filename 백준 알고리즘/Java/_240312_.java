/*1
package baekjoon_prob;

import java.util.Scanner;

public class _240312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int colleage = 0;
        if (a == b && a == c) {
            colleage = 10000 + a * 1000;
        }
        else if(a == b) {
            colleage = 1000 + 100 * a;
        } else if (a == c) {
            colleage = 1000 + 100 * a;
        } else if (b == c) {
            colleage = 1000 + 100 * b;
        } else {
            int max_num = Math.max(a , Math.max(b , c));
            colleage = 100 * max_num;
        }
        System.out.println(colleage);
    }
}*/

/*2
package baekjoon_prob;

import java.util.Scanner;

public class _240312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}*/

/*3
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number1[] = new int[n];
        int number2[] = new int[n];
        for (int i = 0; i < n; i++) {
            number1[i] = sc.nextInt();
            number2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int result = number1[i] + number2[i];
            System.out.println(result);
        }
    }
}
 */

/*4
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = n; i > 0; i--) {
            sum += i;
        }
        System.out.println(sum);
    }
}
 */

/*5
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int price[] = new int[n];
        int count[] = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
            count[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += price[i] * count[i];
        }
        if (sum == total) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
 */

/*6
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n / 4;
        for (int i = 0; i < num; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
 */