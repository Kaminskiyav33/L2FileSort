import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FileRecordsIterator implements Iterator<String> {

    private List<String> list;
    private int cnt;

    public FileRecordsIterator(List<String> list) {
        Collections.reverse(list);
        this.list = list;
        cnt = 0;

    }

    @Override
    public boolean hasNext() {
        if (cnt + 1 < list.size())
        {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String next() {
        return list.get(cnt++);
    }
}
