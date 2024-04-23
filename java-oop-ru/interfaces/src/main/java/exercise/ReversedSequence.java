package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String word;

    ReversedSequence(String word) {
        var reverseWord = new StringBuilder();
        reverseWord.append(word).reverse();
        this.word = reverseWord.toString();
    }

    @Override
    public String toString() {
        return word;
    }

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        return word.toCharArray()[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return word.substring(start, end);
    }
}
// END
