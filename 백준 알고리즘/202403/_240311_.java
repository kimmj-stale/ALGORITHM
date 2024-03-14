package baekjoon_prob;

import java.util.Scanner;

public class _240311_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int plus = sc.nextInt();

        if (minute + plus < 60) {
            minute += plus;
        }
        else {
            if (hour + (plus + minute) / 60 <= 23) {
                hour += plus / 60;
            }
            else {
                hour += plus / 60 - 24;
            }
            minute += plus % 60;
            if (minute >= 60) {
                hour += minute / 60;
                minute %= 60;
            }
        }
        System.out.println(hour + " " + minute);
    }
}
