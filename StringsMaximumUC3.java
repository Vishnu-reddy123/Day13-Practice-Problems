public class StringsMaximumUC3 {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }

    public static void main(String[] args) {
        System.out.printf("Maximum of %s,%s and %s is %s\n", "apple", "watermelon", "kiwi", maximum("apple", "watermelon", "kiwi"));
    }
}
