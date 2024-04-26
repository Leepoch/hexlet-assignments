package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String filepath;
    private Map<String, String> data;

    FileKV(String filepath, Map<String, String> data) {
        this.filepath = filepath;
        this.data = data;
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
