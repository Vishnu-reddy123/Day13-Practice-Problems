package GenericMethod;

public class MaxInteger {
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
        if(x>0 && y>0) {
            System.out.println(num1+" is Maximum");
        }
        else if(x1>0 && y1>0 ) {
            System.out.println(num2+" is Maximum");
        }
        else if(x2>0 && y2>0) {
            System.out.println(num3+" is Maximum");
        }
        else
            System.out.println("Invalid");
    }
}
