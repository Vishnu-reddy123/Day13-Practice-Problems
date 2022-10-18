package GenericMethod;

import static GenericMethod.GenericMaxInteger.*;

public class GenericMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Test Case Program");
        //Test case 1.1-Given Max Number at 1st Position return the Same Number
        System.out.printf("Maximum from %d,%d and %d is: %d\n\n", 25, 15, 20, maximum(15, 20, 25));

        //Test case 1.2-Given Max Number at 2nd Position return the Same Number
        System.out.printf("Maximum from %d,%d and %d is: %d\n\n", 15, 25, 20, maximum(15, 20, 25));

        //Test case 1.3-Given Max Number at 3rd Position return the Same Number
        System.out.printf("Maximum from %d,%d and %d is: %d\n\n", 15, 20, 25, maximum(15, 20, 25));

        //Refactor 1 - Refactor all the 3 to One Generic Method and find the maximum
        System.out.printf("Maximum from %f,%f and %f is: %f\n\n", 10.0F, 15.5F, 10.3F, getMaximum(10.0F, 15.5F, 10.3F));
        System.out.printf("Maximum string is: %s\n", MaxString("NewYork", "SanFrancisco", "Chicago"));
    }
}