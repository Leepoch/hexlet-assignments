package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String word;

    ReversedSequence(String word) {
        this.word = new StringBuilder(word).reverse().toString();
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
// END
