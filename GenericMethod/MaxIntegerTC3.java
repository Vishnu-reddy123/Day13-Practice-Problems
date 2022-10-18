package GenericMethod;

import java.util.Arrays;

public class MaxIntegerTC3 {
    public static void main(String[] args) {
        System.out.println("Welcome to Test Case Program");
        compareToMethod();
    }

    public static void compareToMethod() {
        Integer num1 = new Integer("15");
        Integer num2 = new Integer("25");
        Integer num3 = new Integer("20");

        int x = num1.compareTo(num2);
        int y = num1.compareTo(num3);

        int x1 = num2.compareTo(num1);
        int y1 = num2.compareTo(num3);

        int x2 = num3.compareTo(num1);
        int y2 = num3.compareTo(num2);
        if (x > 0 && y > 0) {
            System.out.println(num1 + " is Maximum");
            AddAtPosFirst();
        } else if (x1 > 0 && y1 > 0) {
            System.out.println(num2 + " is Maximum");
            AddAtPosFirst();
        } else if (x2 > 0 && y2 > 0) {
            System.out.println(num3 + " is Maximum");
            AddAtPosFirst();
        } else
            System.out.println("Invalid");
    }

    //Printing max integer to the first position
    public static void AddAtPosFirst() {
        int[] a = {15, 25, 20};
        int position = 1;
        int max;
        for (int i = 0; i < a.length; i++) {
            max = a[i];
            a[i] = a[position];
            a[position] = max;
        }
        System.out.print(Arrays.toString(a));
        System.out.println();
        AddAtPosSecond();
    }
    //Printing max integer to the second position
    public static void AddAtPosSecond() {
        int[] a = {15, 25, 20};
        int originalPosition = 1;
        int newPosition = 1;
        int max;
        for (int i = 0; i < a.length; i++) {
            max = a[originalPosition];
            a[originalPosition] = a[newPosition];
            a[newPosition] = max;
        }
        System.out.print(Arrays.toString(a));
        System.out.println();
        AddAtPosThird();
    }
    //Printing max integer ar third position
    public static void AddAtPosThird() {
        int[] a = {15, 25, 20};
        int position = 2;
        int max;
        for (int i = 0; i < a.length; i++) {
            max = a[i];
            a[i] = a[position];
            a[position] = max;
        }
        System.out.print(Arrays.toString(a));
        System.out.println();
    }
}
