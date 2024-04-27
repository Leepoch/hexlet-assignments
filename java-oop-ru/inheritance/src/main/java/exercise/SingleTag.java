package exercise;

import java.util.Map;
import java.util.TreeMap;

// BEGIN
public class SingleTag extends Tag {


    public SingleTag(String name, Map<String, String> atrs) {
        super(name, atrs);
    }

    @Override
    public String toString() {
        var text = new StringBuilder();
        text.append("<")
                .append(super.getName());
        var sortedMap = new TreeMap<>(super.getAtrs());
        sortedMap.forEach((key, value) -> text.append(" ")
                .append(key)
                .append("=\"")
                .append(value)
                .append("\""));
        return text.append(">").toString();
    }
}
// END
