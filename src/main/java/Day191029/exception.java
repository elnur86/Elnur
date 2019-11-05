package Day191029;

//import org.graalvm.compiler.replacements.nodes.CStringConstant;

import java.util.ArrayList;

public class exception {

    public static int convertCalculate(String str)
    {
        int k=0,sum=0;
        int length=str.length();
        String newString="";

        for (int i=0;i<length;i++)
        {

            if (Character.compare(str.charAt(i),' ')==0)
            {
                newString="";
                for (int y=k;y<i;y++)
             {
                newString=newString+str.charAt(y);
             }
                sum=sum+Integer.parseInt(newString);
            k=i+1;
                for (int y=k;y<str.length();y++)
                {
                    newString=newString+str.charAt(y);
                }
                sum=sum+Integer.parseInt(newString);
            }
        }

return sum;
    }

    public static void main(String[] args) {
        int x,x1,x2;
        String str,str1,str2;
        str="1 2 -3 abc";
        str1="10 2 3";
        //str2="abd kw 2 4";
        x=convertCalculate(str);
        x1=convertCalculate(str1);
        //x2=convertCalculate(str2);
        System.out.println(x);
        System.out.println(x1);
        //System.out.println(x2);
    }
}
