import java.util.Random;
public class RandomString {

    public static String GenRanStr(int lenght)
    {
        char ch;
        String NewString;
        NewString="";
        Random r = new Random();

        for(int i=0;i<lenght;i++)
        {
            ch = (char) (r.nextInt(26) + 'a');
            NewString=NewString+ch;
        }
    return NewString;

    }

    public static void main(String[] args) {
        String s1= GenRanStr(10);
        String s2= GenRanStr(5);
        System.out.println(s1);
        System.out.println(s2);
    }

}
