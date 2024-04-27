package exercise;

import java.util.Map;

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
        super.getAtrs().forEach((key, value) -> text.append(" ")
                .append(key)
                .append("\"")
                .append(value)
                .append("\""));
        return text.append(">").toString();
    }
}
// END
