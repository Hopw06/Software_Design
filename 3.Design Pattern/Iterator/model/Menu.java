package Iterator.model;

import java.util.Iterator;

public interface Menu {
    String getName();
    String getDecription();
    Iterator createIterator();
}
