/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static class Sorting {
        String Word;
        int Word_Appearance;
        Sorting(String S_Word , int S_Word_Appearance) {
            this.Word = S_Word;
            this.Word_Appearance = S_Word_Appearance;
        }
    }

    public static void main(String[] args) throws IOException {
        //분류 조건
        //1, 자주 나오는 단어일수록 앞에 배치한다.
        //2, 해당 단어의 길이가 길수록 앞에 배치한다.
        //3, 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String , Integer> Word_Table = new HashMap<>();

        //해시 테이블에 저장하는 과정
        while (n-- > 0) {
            String Word = br.readLine();
            //길이 제한 설정
            // 초과한 길이분 만큼 저장시켜 후에 분류시킨다.
            if (Word.length() >= m) {
                if (Word_Table.containsKey(Word)) Word_Table.replace(Word , Word_Table.get(Word)+1);
                else Word_Table.put(Word , 0);
            }
        }

        //분류 후 저장할 테이블 작성 , 분류 기준 설정 후 기존에 저장하기 위해 새로운 클래스 Sorting을 작성
        Sorting[] Sort_Table = new Sorting[Word_Table.size()];
        int idx = 0;

        for (Map.Entry<String , Integer> entry : Word_Table.entrySet()) {
            Sort_Table[idx++] = new Sorting(entry.getKey() , entry.getValue());
        }

        //비교 기준 작성
        Arrays.sort(Sort_Table , (o1 , o2) -> {
            //중복되는 알파벳을 제와하고 길이 비교
            if (o1.Word_Appearance != o2.Word_Appearance) return Integer.compare(o2.Word_Appearance , o1.Word_Appearance);
            //중복되는 알파벳을 제외하지 않고 절대적인 길이 비교
            else if (o1.Word.length() != o2.Word.length()) return Integer.compare(o2.Word.length() , o1.Word.length());
            //사전순으로 비교
            else return o1.Word.compareTo(o2.Word);
        });

        StringBuilder sb = new StringBuilder();
        //stream을 이용해 분류 후 단어들 출력
        Arrays.stream(Sort_Table).forEach(sorting -> sb.append(sorting.Word).append("\n"));

        System.out.println(sb);
    }
}
 */
