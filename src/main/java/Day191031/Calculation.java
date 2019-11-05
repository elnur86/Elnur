package Day191031;

import java.util.ArrayList;

public class Calculation {

    public static boolean isOdd(int x)
    {
        return x%2!=0;
    }
    public static boolean isEven(int x)
    {
        return !isOdd(x);
    }

    public static ArrayList<Integer> calc(String origin) {
        int total = 0;
                int result1=0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        if (origin == null) return null;
        String[] split = origin.split("\\+");
        for (int i = 0; i < split.length; i++) {
            try {
                String[] Splitted = split[i].split("/");
                for (int y = 0; y < Splitted.length; y++) {
                    try {
                        numbers.add(Integer.parseInt(Splitted[y]));
                        total = total + numbers.get(y);
                        if(isEven(y))  result1=result1+numbers.get(y);

                    } catch (NumberFormatException ignore) {
                    }
                }
            } catch (NumberFormatException ignore) {
            }
        }


        return numbers;
    }

    public static void main(String[] args) {

        ArrayList<Integer> x = new ArrayList<>();
        x=calc("2/3+5/3+6");
        System.out.println(x);

    }

}
