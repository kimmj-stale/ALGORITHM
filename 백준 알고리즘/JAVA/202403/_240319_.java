/*1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int ascii_num = s.charAt(i);
            if (ascii_num >= 65) {
                ascii_num -= 55;
                sum += ascii_num;
                if (i == s.length() - 1) {
                    break;
                }
                else {
                    sum *= num;
                }
            }
            else {
                ascii_num -= 48;
                sum += ascii_num;
                if (i == s.length() - 1) {
                    break;
                }
                else {
                    sum *= num;
                }
            }
        }
        System.out.println(sum);
    }
}
 */
