package storage;

import dragon.Dragon;
import java.io.IOException;
import java.util.HashSet;

public interface Storage {
    void save(HashSet<Dragon> collection) throws IOException;

    HashSet<Dragon> load() throws IOException;

    void update(HashSet<Dragon> collection) throws IOException;
}
