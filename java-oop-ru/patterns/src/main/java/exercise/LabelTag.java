package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String tagInText;
    private TagInterface tag;

    LabelTag(String tagInText, TagInterface tag) {
        this.tagInText = tagInText;
        this.tag = tag;
    }

    public String render() {
        return "<label>" + tagInText + tag.render() + "</label>";
    }
}
// END
