public class FloatsMaximumUC2<T extends Comparable<T>>{
    T x, y, z;
    public FloatsMaximumUC2(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum() {
        return FloatsMaximumUC2.maximum(x, y, z);
    }
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }
    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
    }

    public static void main(String[] args) {
        Float xF1 = 12.2f, yF1 = 32.2f, zF1 = 40.9f;
        new FloatsMaximumUC2(xF1, yF1, zF1).maximum();
    }
}

