import core.Coordinates;

import dragon.*;

import storage.FileStorage;

import java.util.HashSet;

public class Main {

    public static void main(String args[]) {
        var collection = new collection.Collection();

        collection.add(
                new Dragon(
                        "Smaug",
                        new Coordinates(10.0f, 20.0f),
                        500,
                        10000,
                        DragonType.FIRE,
                        new DragonHead(2.0f, 5.0f)));
        collection.add(
                new Dragon(
                        "Charlie",
                        new Coordinates(10.0f, 20.0f),
                        100,
                        10000,
                        DragonType.FIRE,
                        new DragonHead(2.0f, 5.0f)));

        var storage = new FileStorage(java.nio.file.FileSystems.getDefault().getPath(System.getenv("STORAGE_PATH")));
        try {
            storage.save(collection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
