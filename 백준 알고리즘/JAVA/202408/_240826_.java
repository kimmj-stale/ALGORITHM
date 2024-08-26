import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int n , m;
    public static Map<String , Integer> word_table;
    public static String[] table;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        table = new String[n];
        Comparator <String> comparator = (s1 , s2) -> s1.compareTo(s2);

        word_table = new TreeMap<>(comparator);
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (!word_table.containsKey(word)) word_table.put(word , 1);
            else word_table.replace(word , word_table.get(word) + 1);
        }

        sort_by_length(m);
        sort_by_count();

        for (String val : word_table.keySet()) {
            System.out.println(val);
        }
    }

    //이미 있는 key 값이면 value값에 +1 , 그렇지 않으면 새로 추가
    public static void sort_by_count() {
        List<Integer> number_list = new ArrayList<>(word_table.values());

    }

    public static void sort_by_length(int m) {
        for (String val : word_table.keySet()) {
            int word_length = val.length();

            //길이 순으로 정렬
            if (word_length) {

            }

            ArrayList<Character> table = new ArrayList<>();
            for (int i = 0; i < val.length(); i++) {
                if (!table.contains(val.charAt(i))) table.add(val.charAt(i));
                else word_length--;
            }

            if (word_length != m) word_table.remove(val);


        }
    }


}
// 2번 3번 알고리즘 작성 실패