package storage;

import java.io.IOException;
import java.util.HashSet;
import dragon.Dragon;

public interface Storage {
    void save(HashSet<Dragon> collection) throws IOException;

    HashSet<Dragon> load() throws IOException;

    void update(HashSet<Dragon> collection) throws IOException;
}
