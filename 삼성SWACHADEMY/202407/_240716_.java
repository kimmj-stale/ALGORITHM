/*1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alpha = br.readLine();
        for (int i = 0; i < alpha.length(); i++) {
            int num = alpha.charAt(i) - 64;

            if (i != alpha.length() - 1) System.out.print(num + " ");
            else System.out.print(num);
        }
    }
}
 */

/*2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentence = br.readLine();
        String ans = "";
        for (int i = 0; i < sentence.length(); i++) {
            int num = sentence.charAt(i);
            if (num >= 97) {
                num -= 32;
                ans += String.valueOf(Character.toChars(num));
            }
            else ans += String.valueOf(Character.toChars(num));
        }
        System.out.println(ans);
    }
}
 */