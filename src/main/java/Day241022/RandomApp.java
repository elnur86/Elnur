package Day241022;

public class RandomApp {



    public static String GenRand (int length)
    {
        String RanStr="";
        Character c;
        int range='Z'-'A'+1;

        //Random Ran = new Random();
        for(int i=0;i<length;i++) {
            c = (char) (Math.random() * range + 'A');
            boolean check=(int)((Math.random()*100))%2==0;
                 if (check){c=Character.toLowerCase(c);}
            RanStr=RanStr + c;
        }
        return RanStr;
    }

    public boolean isUpper(char c)
    {
        return c>='A' && c<='Z';
    }

    public boolean isLower(char c)
    {
        return c>='a' && c<='z';
    }

    public boolean isVowel(char c)
    {
        char upper= Character.toUpperCase(c);
        return upper=='A'||upper=='E'||upper=='I'||upper=='O'||upper=='U';
    }

    public boolean isConsonant(char c)
    {
        return ! isVowel(c);
    }

    public boolean isUpperConsonant (char c)
    {
        return isUpper(c) && isConsonant(c);
    }

    public boolean isUpperVowel (char c)
    {
        return isUpper(c) && isVowel(c);
    }

    public boolean isLowerConsonant (char c)
    {
        return isLower(c) && isConsonant(c);
    }

    public boolean isLowerVowel (char c)
    {
        return isLower(c) && isVowel(c);
    }

    public Result process(String origin)
    {
        StringBuilder uc= new StringBuilder();
        StringBuilder lc= new StringBuilder();
        StringBuilder uv= new StringBuilder();
        StringBuilder lv= new StringBuilder();

        for (int i=0;i<origin.length();i++)
        {
            char c=origin.charAt(i);
            if(isUpperConsonant(c)){uc.append(c);}
            else if (isUpperVowel(c)){uv.append(c);}
            else if (isLowerConsonant(c)){lc.append(c);}
            else if (isLowerVowel(c)){lv.append(c);}
        }

        return new Result(origin,uc.toString(),uv.toString(),lc.toString(),lv.toString());

    }
    public static void main(String[] args)
    {
        String S1=GenRand(50);
        RandomApp app= new RandomApp();
        Result result=app.process(S1);
        app.print(result);
    }

    private void print(Result result) {
        System.out.printf("Origin:%s\nUC:%s\nUV:%s\nLC:%s\nLV:%s\n",result.getOrigin(),result.getUpper_consonants(),result.getUpper_vowels(),result.getLower_consonants(),result.getLower_vowels());
    }


}
