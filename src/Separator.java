import java.util.stream.IntStream;

public class Separator {
    int[] array = {};

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {
        return IntStream.of(array).filter(item -> item % 2 == 0).toArray();
    }

    public int[] odd() {
        return IntStream.of(array).filter(item -> item % 2 != 0).toArray();
    }
}
