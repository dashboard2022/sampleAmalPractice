import java.util.Arrays;

public class ProblemNumberOneSolved {
    public static void main(String[] args) {

        String s1 = "anagram";
        String t1 = "nagaram";
        char[] CharsOfS1 = s1.toCharArray();
        Arrays.sort(CharsOfS1);

        char[] CharsOfT1 = t1.toCharArray();
        Arrays.sort(CharsOfT1);

        System.out.println(Arrays.equals(CharsOfS1, CharsOfT1));

        String s2 = "rat";
        String t2 = "car";

        char[] CharsOfS2 = s2.toCharArray();
        Arrays.sort(CharsOfS2);

        char[] CharsOfT2 = t2.toCharArray();
        Arrays.sort(CharsOfT2);

        System.out.println(Arrays.equals(CharsOfS2,CharsOfT2));


        /* По идеи ты уже дал мне значения переменных ( s , t), а так
          если бы я не знал какие слова там были бы
          можно было бы начать с проверки на кол-во букв в s и t
          если они между собой = то анаграмма а если не = то нет
         */

    }
}
