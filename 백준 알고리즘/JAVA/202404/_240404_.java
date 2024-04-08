/*1     merge sort
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
    private static int[] sorted;
    public static void merge_sort(int[] arr) {
        sorted = new int[arr.length];
        merge_sort(arr , 0 , arr.length - 1);
        sorted = null;
    }

    private static void merge_sort(int[] arr , int left , int right) {
        for (int size = 1; size <= right; size += size) {
            for (int l = 0; l <= right - size; l += (2 * size)) {
                int low = l;
                int middle = l + size - 1;
                int high = Math.min(l + (2 * size) - 1 , right);
                merge(arr , low , middle , high);
            }
        }
    }
    private static void merge(int[] arr , int left , int mid , int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;

        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                sorted[idx] = arr[l];
                idx++;
                l++;
            }
            else {
                sorted[idx] = arr[r];
                idx++;
                r++;
            }
        }
        if (l > mid) {
            while (r <= right) {
                sorted[idx] = arr[r];
                idx++;
                r++;
            }
        }
        else {
            while (l <= mid) {
                sorted[idx] = arr[l];
                idx++;
                l++;
            }
        }
        for (int i = left; i <= right; i++) {
            arr[i] = sorted[i];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        merge_sort(arr);
        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
 */

/*2

 */