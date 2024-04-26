package exercise;

import java.util.HashMap;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        var tempStorage = new HashMap<>(storage.toMap());
        tempStorage.forEach((key, value) -> {
            storage.unset(key);
            storage.set(value, key);
        });
    }
}
// END
