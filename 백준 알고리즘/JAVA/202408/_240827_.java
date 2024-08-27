/* sort 심화
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        StringBuilder sb;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String , Integer> word_table = new HashMap<>();

        while (n-- > 0) {
            String word = br.readLine();
            if (word.length() >= m) {
                if (word_table.containsKey(word)) word_table.replace(word , word_table.get(word) + 1);
                else word_table.put(word , 1);
            }
        }

        Word[] sort_table = new Word[word_table.size()];
        int idx = 0;

        for (Map.Entry<String , Integer> entry : word_table.entrySet()) {
            sort_table[idx++] = new Word(entry.getKey() , entry.getValue());
        }

        Arrays.sort(sort_table , (o1 , o2) ->{
            if (o1.num_Appearance != o2.num_Appearance) return Integer.compare(o2.num_Appearance, o1.num_Appearance);
            else if (o1.word.length() != o2.word.length()) return Integer.compare(o2.word.length() , o1.word.length());
            else return o1.word.compareTo(o2.word);
        });

        sb = new StringBuilder();
        Arrays.stream(sort_table).forEach(word -> sb.append(word.word).append("\n"));
        System.out.println(sb);
    }
    public static class Word {
        String word;
        int num_Appearance;

        Word (String word , int num_Appearance) {
            this.word = word;
            this.num_Appearance = num_Appearance;
        }
    }
}
 */
