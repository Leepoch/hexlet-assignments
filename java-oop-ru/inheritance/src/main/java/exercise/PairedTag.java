package exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String tegBody;
    private List<Tag> singleTags = new ArrayList<>();

    public PairedTag(String name,
                     Map<String, String> atrs,
                     String tegBody,
                     List<Tag> singleTags) {
        super(name, atrs);
        this.tegBody = tegBody;
        this.singleTags = singleTags;
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
        text.append(">");
        singleTags.forEach(tag -> text.append(tag.toString()));
        return text.append(tegBody)
                .append("</")
                .append(super.getName())
                .append(">")
                .toString();
    }
}
// END
