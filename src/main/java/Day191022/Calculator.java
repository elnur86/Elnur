package Day191022;

public class Calculator {
    public static int add (int a, int b) {
        return a + b;
    }
    public static int sub (int a, int b) {
        return a - b;
    }
    public int mul (int a, int b) {
        return a * b;
    }
    public int div (int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int Result;
        Result=add(2,3);
        System.out.println(Result);
        Result= sub(5,2);
        System.out.println(Result);
    }



}

