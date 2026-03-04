package storage;

import dragon.Dragon;
import java.io.IOException;
import java.util.HashSet;

public interface Storage {
    void save(collection.Collection collection) throws IOException;

    collection.Collection load() throws IOException;
}
