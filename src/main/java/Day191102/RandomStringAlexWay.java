package Day191102;

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
}
