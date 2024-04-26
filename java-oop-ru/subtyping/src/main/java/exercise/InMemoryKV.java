package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class InMemoryKV implements KeyValueStorage{
    private Map<String, String> data = new HashMap<>();

    InMemoryKV(Map<String, String> coll) {
        this.data.putAll(coll);
    }

    public void set(String key, String value) {
        data.put(key, value);
    }

    public void unset(String key) {
        data.remove(key);
    }

    public String get(String key, String defaultValue) {
        return data.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        return data;
    }
}
// END