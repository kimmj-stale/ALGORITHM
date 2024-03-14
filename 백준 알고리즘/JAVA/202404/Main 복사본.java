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