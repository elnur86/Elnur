package Day191029;

public class exceptionbyAlex
{
    public static int calcSum(String origin) {
        if (origin == null) return 0;
        String[] split = origin.split(" ");
        int total =0;
        for (int i=0; i<split.length; i++) {
            try {
                total+= Integer.parseInt(split[i]);
            } catch (NumberFormatException ignore) {}
        }
        return total;
    }


    public static void main(String[] args) {

        int x=calcSum("1 2 37h 4 tgfk 3");
        System.out.println(x);
    }


}
