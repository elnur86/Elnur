import java.util.Random;
public class RandomString {

    public static String GenRanStr(int lenght)
    {
        char ch;
        String NewString;
        NewString="";
        Random r = new Random();
        Random randomCheck=new Random();
        int check;
        for(int i=0;i<lenght;i++)
        {
            check =randomCheck.nextInt(2);
            if(check==0) {ch = (char) (r.nextInt('z'-'a'+1)+'a'); NewString=NewString+ch;}
            else {ch = (char) (r.nextInt('Z'-'A'+1)+'A'); NewString=NewString+ch;}

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
