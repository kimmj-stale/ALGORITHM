
/*1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i * (i - 1));
    }
}
 */

/*2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum = 1;
        for (int j = 0; j < i; j++) {
            sum *= 2;
        }
        System.out.println(sum);
    }
}
 */

/*3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}   
 */

/*3
public class Main {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(0);
    }
}
 */

/*4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        System.out.println(1);
    }
}
 */

/*5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(n * n);
        System.out.println(2);
    }
}
 */

/*6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(2);
    }
}
 */

/*7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(n * n * n);
        System.out.println(3);
    }
}
 */

/*8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        long sum_plus = 0;
        if (n <= 2) {
            System.out.println(0);
        }
        else {
            for (int i = 1; i < n - 1; i++) {
                sum += i;
                sum_plus += sum;
            }
            System.out.println(sum_plus);
        }
        System.out.println(3);
    }
}
 */

/*9

 */