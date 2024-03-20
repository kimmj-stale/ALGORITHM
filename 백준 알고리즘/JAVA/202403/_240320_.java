/*1
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int div = sc.nextInt();
        int cal_num = number;
        ArrayList<String> ans = new ArrayList<>();
        while (true) {
            //div 진수를 구하는 과정
            int last = cal_num % div;
            cal_num -= last;
            if (last >= 10) {
                last += 55;
                ans.add(String.valueOf((char) last));
            }
            else {
                last += 48;
                ans.add(String.valueOf((char) last));
            }
            //값이 0이 나오는 경우는 div 보다 작은 값이 나왔고 그 나머지를 뺀 값이 0이 나온 경우
            if (cal_num == 0) {
                break;
            }
            else {
                cal_num /= div;
            }
        }
        int n = ans.size();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(ans.get(i));
        }
    }
}
 */

/*2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int all_money = sc.nextInt();
            int quarter = all_money / 25;
            all_money -= 25 * quarter;
            int dime = all_money / 10;
            all_money -= 10 * dime;
            int nickel = all_money / 5;
            all_money -= 5 * nickel;
            int penny = all_money;
            System.out.println( quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
 */

/*3

 */