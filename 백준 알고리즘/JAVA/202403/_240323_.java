/*1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(n * 4);
    }
}
 */

/*2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int min_x = 10001;
        int min_y = 10001;
        int max_x = -10001;
        int max_y = -10001;
        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (min_x >= x) {
                min_x = x;
            }
            if (max_x <= x) {
                max_x = x;
            }
            if (min_y >= y) {
                min_y = y;
            }
            if (max_y <= y) {
                max_y = y;
            }
        }
        System.out.println((max_x - min_x) * (max_y - min_y));
    }
}
 */

/*3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        if (angle1 + angle2 + angle3 != 180) {
            System.out.println("Error");
        }
        else {
            if (angle1 == 60 && angle2 == 60) {
                System.out.println("Equilateral");
            }
            else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
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
        while (true) {
            int length1 = sc.nextInt();
            int length2 = sc.nextInt();
            int length3 = sc.nextInt();
            if (length1 == 0) {
                break;
            }
            if (length1 + length2 <= length3 || length2 + length3 <= length1 || length1 + length3 <= length2) {
                System.out.println("Invalid");
            }
            else {
                if (length1 == length2 && length2 == length3) {
                    System.out.println("Equilateral");
                }
                else if (length1 == length2 || length2 == length3 || length1 == length3) {
                    System.out.println("Isosceles");
                }
                else {
                    System.out.println("Scalene");
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
        int c = sc.nextInt();
        if (a + b <= c || a + c <= b || b + c <= a) {
            int max_length = Math.max(a, Math.max(b, c));
            int triangle_able_length = a + b + c - max_length;
            System.out.println(triangle_able_length * 2 - 1);
        }
        else {
            int able_length = a + b + c;
            System.out.println(able_length);
        }
    }
}
 */