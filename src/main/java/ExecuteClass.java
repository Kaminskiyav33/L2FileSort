import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ExecuteClass {
    public static void main(String[] args) {

        HashMap <String, Integer> hashMap1 = new HashMap<String, Integer>();
        ArrayList<String> fileRecords = new ArrayList();

        try(FileReader reader = new FileReader("Input.txt"))
        {
            BufferedReader bufferedReader = new BufferedReader(reader);

            String s;
            while((s = bufferedReader.readLine()) != null){

                fileRecords.add(s);
                System.out.println(s);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        System.out.print("\n count (distinct of words) is ");
        System.out.println(getCountOfWords(fileRecords));

        System.out.print("\n Sort V1 Words is ");
        System.out.println(getSortWordsV1(fileRecords));

        System.out.print("\n Sort V2(Lambda) Words is ");
        System.out.println(getSortWordsV1(fileRecords));


        


    }

    public static int getCountOfWords(ArrayList<String> list){
        Set<String> set = new HashSet<>();
        int count = 0;
        for (String s: list
             ) {
            String[] words;
            words = s.split(" ");
            for (String word: words
                 ) {
                if (set.add(word)) {
                    count++;
                }
            }
        };

        return count;
    }

    public static Set<String> getSortWordsV1(ArrayList<String> list){

        //Set<String> set = new TreeSet<>((o1, o2) -> o1.compareTo(o2.))

        //ComparatorOfWordsLength comparatorOfWordsLength = new ComparatorOfWordsLength();
        //Set<String> set = new TreeSet<>(comparatorOfWordsLength);
        Set<String> set = new TreeSet<>(new ComparatorOfWordsLength());

        for (String s: list
        ) {
            String[] words;
            words = s.split(" ");
            for (String word: words
            ) {
                set.add(word);
            }
        };

        return set;

    }


    public static Set<String> getSortWordsV2(ArrayList<String> list){

        //Set<String> set = new TreeSet<>((o1, o2) -> o1.compareTo(o2.))

        //ComparatorOfWordsLength comparatorOfWordsLength = new ComparatorOfWordsLength();
        //Set<String> set = new TreeSet<>(comparatorOfWordsLength);
        Set<String> set = new TreeSet<String>((String o1, String o2) ->
            (o1.length() < o2.length() ? -1 : ((o1.length() == o2.length()) ? o1.compareTo(o2) : 1)));

        for (String s: list
        ) {
            String[] words;
            words = s.split(" ");
            for (String word: words
            ) {
                set.add(word);
            }
        };

        return set;

    }

    public static HashMap<String, Integer> getNumberOfWords(ArrayList<String> list) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String s: list
        ) {
            String[] words;
            words = s.split(" ");
            for (String word: words
            ) {
                Integer i;
                if ((i = map.get(word)) == null) {
                    map.put(word, new Integer(1));
                }
                else
                {
                    i++;
                }

            }
        };

        return map;

    )


}
