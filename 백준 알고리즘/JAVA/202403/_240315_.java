/*1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            arr[i] = score;
            if (max < score) {
                max = score;
            }
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ((double) arr[i] / max * 100);
        }
        System.out.println(sum / n);
    }
}
 */

/*2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(s.charAt(n - 1));
    }
}
 */

/*3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.length());
    }
}
 */

/*4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char a = s.charAt(0);
            char b = s.charAt(s.length() - 1);
            System.out.println(String.valueOf(a) + String.valueOf(b));
        }
    }
}
 */

/*5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        System.out.println((int) a);
    }
}
 */

/*6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String s = sc.next();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            char a = s.charAt(i);
            sum += a - 48;
        }
        System.out.println(sum);
    }
}
 */

/*7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String s = sc.next();
        int len = s.length();
        for (int i = 0; i < 26; i++) {
            boolean con = true;
            for (int j = 0; j < len; j++) {
                if (alphabet.charAt(i) == s.charAt(j)) {
                    System.out.print(j);
                    con = true;
                    break;
                }
                else {
                    con = false;
                }
            }
            if (con == false) {
                System.out.print(-1);
            }
            if (i == 25) {
                break;
            }
            else {
                System.out.print(" ");
            }
        }
    }
}
 */

/*8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                char a = s.charAt(j);
                for (int k = 0; k < r; k++) {
                    System.out.print(a);
                }
            }
            System.out.println();
        }
    }
}
 */

/*9
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        int count = 1;
        for (int i = 0; i < sent.length(); i++) {
            if (sent.charAt(i) == ' ') {
                count++;
            }
        }
        if (sent.charAt(0) == ' ') {
            count--;
        }
        if (sent.charAt(sent.length() - 1) == ' ') {
            count--;
        }
        System.out.println(count);
    }
}
 */

/*10
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        int arr1[] = new int[3];
        int arr2[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = num1.charAt(i) - 48;
            arr2[i] = num2.charAt(i) - 48;
        }
        int new_n1 = arr1[2] * 100 + arr1[1] * 10 + arr1[0];
        int new_n2 = arr2[2] * 100 + arr2[1] * 10 + arr2[0];
        if (new_n1 > new_n2) {
            System.out.println(new_n1);
        }
        else {
            System.out.println(new_n2);
        }
    }
}
 */