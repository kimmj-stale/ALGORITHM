/*1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String input_word = word.toLowerCase();
        int num_arr[] = new int[26];
        int max_index = 0;
        int alert_to_num = 0;
        int count = 0;
        //요소 전체 0으로 전환
        for (int i = 0; i < 26; i++) {
            num_arr[i] = 0;
        }
        //char을 아스키코드로 변환 후 숫자로 생각
        //받은 문자를 소문자로 변환 후 생각 - 대문자 소문자 아스키 차이
        for (int i = 0; i < word.length(); i++) {
            int char_to_int = input_word.charAt(i);
            num_arr[char_to_int - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (num_arr[i] >= max_index) {
                max_index = num_arr[i];
                alert_to_num = i;
            }
        }
        //중복되는 최댓값을 구하고 count로 값 특정하기
        for (int i = 0; i < 26; i++) {
            if (num_arr[alert_to_num] == num_arr[i]) {
                count++;
            }
        }
        //+65 해서 대문자로 변환하기
        char ans = (char) (alert_to_num + 65);
        //count값이 1이면 정상적으로 값 출력
        if (count == 1) {
            System.out.println(ans);
        }
        //0이면 출력값 낼 필요 X
        //2 이상이면 ?가 출력
        else {
            System.out.println("?");
        }
    }
}
 */

/*2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int c_alphabet = word.length();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '=') {
                if (i >= 2) {
                    if (word.charAt(i - 1) == 'z' && word.charAt(i - 2) == 'd') {
                        c_alphabet -= 2;
                    }
                    else {
                        c_alphabet--;
                    }
                }
                if (i == 1) {
                    c_alphabet--;
                }
            }
            if (word.charAt(i) == '-') {
                c_alphabet--;
            }
            if (word.charAt(i) == 'j') {
                if (i >= 1) {
                    if (word.charAt(i - 1) == 'n' || word.charAt(i - 1) == 'l') {
                        c_alphabet--;
                    }
                }
            }
        }
        System.out.println(c_alphabet);
    }
}
 */