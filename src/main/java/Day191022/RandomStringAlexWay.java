package Day191022;

import java.util.Random;
public class RandomStringAlexWay {

    public static String GenRanStr(int lenght)
    {
        int range='Z'-'A'+1;
        String NewString="";

        for(int i=0;i<lenght;i++)
        {
            boolean way = (int) ((Math.random()*100))%2==0;
            char c =(char)(Math.random()*range+(way?'A':'a'));
            NewString= NewString+c;
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
