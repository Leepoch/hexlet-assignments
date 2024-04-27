package exercise;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    private String name;
    private Map<String, String> atrs = new HashMap<>();

    public Tag(String name, Map<String, String> atrs) {
        this.name = name;
        this.atrs.putAll(atrs);
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getAtrs() {
        return atrs;
    }

    @Override
    public abstract String toString();
}
// END
