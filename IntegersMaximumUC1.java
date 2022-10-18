public class IntegersMaximumUC1<T extends Comparable<T>>{
    T x, y, z;
    public IntegersMaximumUC1(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum() {
        return IntegersMaximumUC1.maximum(x, y, z);
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
        Integer xInt = 12, yInt = 32, zInt = 40;
        new IntegersMaximumUC1(xInt, yInt, zInt).maximum();
    }
    }


