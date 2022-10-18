package GenericMethod;

public class MaxValueUC5 <T extends Comparable<T>>{
    public T v1, v2, v3;

    public MaxValueUC5(T v1, T v2, T v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    private T maximum() {
        return MaxValueUC5.maximum(v1, v2, v3);
    }

    public static <T extends Comparable<T>> T maximum(T v1, T v2, T v3) {
        T max = v1;
        if (v2.compareTo(max) > 0) {
            max = v2;
        }
        if (v3.compareTo(max) > 0) {
            max = v3;
        }
        printMax(v1, v2, v3, max);
        return max;
    }

    public static String testMaximum(String s1, String s2, String s3) {
        String max1 = s1;
        if (s2.compareTo(max1) > 0) {
            max1 = s2;
        }
        if (s3.compareTo(max1) > 0) {
            max1 = s3;
        }
        printMax(s1, s2, s3, max1);
        return max1;
    }

    public static <T> void printMax(T s1, T s2, T s3, T max1) {
        System.out.printf("Maximum value between %s, %s and %s is %s\n", s1, s2, s3, max1);
    }

    public static void main(String[] args) {
        Integer v1Int = 3, v2Int = 9, v3Int = 0;
        Float v1Float = 27.7f, v2Float = 31.5f, v3Float = 38.9f;
        String s1Str = "MercedesBenz", s2Str = "RollsRoyce", s3Str = "Lamborghini";
        new MaxValueUC5(v1Int, v2Int, v3Int).maximum();
        new MaxValueUC5(v1Float, v2Float, v3Float).maximum();
        new MaxValueUC5(s1Str, s2Str, s3Str).maximum();
    }

}