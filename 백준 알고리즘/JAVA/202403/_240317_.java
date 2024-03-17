/*1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("         ,r'\"7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println(" \\. \". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");
    }
}
 */

/*2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chess[] = {1 , 1 , 2 , 2 , 2 , 8};
        for (int i = 0; i < 6; i++) {
            int ans = sc.nextInt();
            System.out.print(chess[i] - ans);
            if (i != 5) {
                System.out.print(" ");
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
        int line = sc.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = line - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < line; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * (line - i) - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */

/*4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        boolean ans = true;
        if (len % 2 == 0) {
            for (int i = 0; i <= len / 2; i++) {
                if (s.charAt(i) == s.charAt(len - i - 1)) {
                    ans = true;
                }
                else {
                    ans = false;
                    break;
                }
            }
        }
        else {
            for (int i = 0; i < (len + 1) / 2; i++) {
                if (s.charAt(i) == s.charAt(len - i - 1)) {
                    ans = true;
                }
                else {
                    ans = false;
                    break;
                }
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

/*5

 */
