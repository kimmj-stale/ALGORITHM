/*1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0) {
                break;
            }
            if (a % b != 0) {
                if (b % a != 0) {
                    System.out.println("neither");
                }
                else {
                    System.out.println("factor");
                }
            }
            else {
                System.out.println("multiple");
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
        while (true) {
            int a = sc.nextInt();
            int sum = 0;
            if (a == -1) {
                break;
            }
            int arr[] = new int[a];
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    sum += i;
                    arr[i] = 1;
                }
            }
            if (sum == a) {
                System.out.print(a + " = " + 1);
                for (int i = 2; i < a; i++) {
                    if (arr[i] == 1) {
                        System.out.print(" + ");
                        System.out.print(i);
                    }
                }
                System.out.println();
            } else {
                System.out.println(a + " is NOT perfect.");
            }
        }
    }
}
 */

/*3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0;
        boolean ans = false;
        for (int i = 0; i < T; i++) {
            int if_prime_num = sc.nextInt();
            if (if_prime_num == 2) {
                count++;
            }
            else if (if_prime_num >= 3) {
                for (int j = 2; j < if_prime_num; j++) {
                    if (if_prime_num % j == 0) {
                        ans = false;
                        break;
                    }
                    else {
                        ans = true;
                    }
                }
                if (ans == true) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
 */

/*3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range1 = sc.nextInt();
        int range2 = sc.nextInt();
        int sum = 0;
        boolean ans = true;
        int min_prime_num = 10001;
        int arr[] = new int[10001];
        for (int i = range1; i <= range2; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    ans = false;
                    break;
                }
                else {
                    ans = true;
                }
            }
            if (ans == true) {
                arr[i] = 1;
            }
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 1) {
                sum += i;
                if (min_prime_num > i)  {
                    min_prime_num = i;
                }
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min_prime_num);
        }
    }
}
 */

/*4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println(2);
        }
        else if (n == 1) {
            System.out.println();
        }
        else {
            for (int i = 2; i <= n; i++) {
                while (true) {
                    if (n % i == 0) {
                        System.out.println(i);
                    }
                    else {
                        break;
                    }
                    n /= i;
                }
            }
        }

    }
}
 */

/*5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
    }
}
 */

/*6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int length_x = 0;
        int length_y = 0;
        if (w - x <= x) {
            length_x = w - x;
        }
        else {
            length_x = x;
        }
        if (h - y <= y) {
            length_y = h - y;
        }
        else {
            length_y = y;
        }
        if (length_x <= length_y) {
            System.out.println(length_x);
        }
        else {
            System.out.println(length_y);
        }
    }
}
 */

/*7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[1001];
        int arr2[] = new int[1001];
        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr1[x]++;
            arr2[y]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (arr1[i] == 1) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        for (int i = 0; i < 1000; i++) {
            if (arr2[i] == 1) {
                System.out.print(i);
            }
        }
        System.out.println();
    }
}
 */