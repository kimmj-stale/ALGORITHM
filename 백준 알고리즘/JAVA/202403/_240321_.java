/*1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1 = 1     //0
        //2 = 2 ~ 7     //6
        //3 = 8 ~ 19    //12
        //4 = 20 ~ 37   //18
        //5 = 38 ~ 61   //24
        //.....
        int range1 = 1;
        int range2 = 1;
        int st = 1;
        int i = 0;
        while (true) {
            //range값을 수정하고 범위 확정
            i++;
            range1 = range2 + 1;
            range2 = range1 + 6 * i - 1;

            if (n == 1) {
                System.out.println(1);
                break;
            }
            else if (n >= range1 && n <= range2) {
                System.out.println(i + 1);
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
        int n = sc.nextInt();
        int i = 1;
        int range1 = 1;
        int range2 = 1;
        while (true) {
            i++;
            range1 = range2 + 1;
            range2 = range1 + i - 1;
            if (n == 1) {
                System.out.println(1 + "/" + 1);
                break;
            }
            else if (n >= range1 && n <= range2) {
                if (i % 2 == 0) {
                    int div_s = 1 + n - range1;
                    int div_m = i - n + range1;
                    System.out.println(div_s + "/" + div_m);
                    break;
                }
                else {
                    int div_s = i - n + range1;
                    int div_m = 1 + n - range1;
                    System.out.println(div_s + "/" + div_m);
                    break;
                }
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
        int up = sc.nextInt();
        int down = sc.nextInt();
        int total_up = sc.nextInt();
        if (up >= total_up) {
            System.out.println(1);
        }
        else if ((total_up - up) <= (up - down)) {
            System.out.println(2);
        }
        else {
            int day = (total_up - up) / (up - down);
            if ((up - down) * day >= total_up - up) {
                System.out.println(day + 1);
            }
            else {
                System.out.println(day + 2);
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
        double sum = 0;
        double scholar = 0;
        double div = 0;
        for (int i = 0; i < 20; i++) {
            String s = sc.next();
            double score = sc.nextDouble();
            String col = sc.next();
            div += score;
            if (col.equals("A+")) {
                scholar = 4.5;
            }else if (col.equals("A0")) {
                scholar = 4.0;
            }else if (col.equals("B+")) {
                scholar = 3.5;
            }else if (col.equals("B0")) {
                scholar = 3.0;
            }else if (col.equals("C+")) {
                scholar = 2.5;
            }else if (col.equals("C0")) {
                scholar = 2.0;
            }else if (col.equals("D+")) {
                scholar = 1.5;
            }else if (col.equals("D0")) {
                scholar = 1.0;
            }else if (col.equals("F")) {
                scholar = 0;
            }else if (col.equals("P")) {
                scholar = 0;
                div -= score;
            }
            sum += scholar * score;
        }
        System.out.println(sum / div);
    }
}
 */
