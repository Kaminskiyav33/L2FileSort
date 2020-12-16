import java.util.Comparator;

public class ComparatorOfWordsLength implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return (o1.length() < o2.length()) ? -1 : ((o1.length() == o2.length()) ? o1.compareTo(o2) : 1);
    }
}
