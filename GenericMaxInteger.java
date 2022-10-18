package GenericMethod;

public class GenericMaxInteger {
    //Generic method
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }
    public static <T extends Comparable<T>> T getMaximum(T f1, T f2, T f3) {
        //Initializing the Variable
        T max1 = f1;
        if (f2.compareTo(f1) > 0)
            max1 = f2;

        if (f3.compareTo(max1) > 0)
            max1 = f3;
        return max1;
    }

    public static <T extends Comparable<T>> T MaxString(T u, T v, T w) {
        //Initializing the Variable
        T max2 = u;
        if (v.compareTo(u) > 0)
            max2 = v;

        if (w.compareTo(max2) > 0)
            max2 = w;
        return max2;
    }
}
