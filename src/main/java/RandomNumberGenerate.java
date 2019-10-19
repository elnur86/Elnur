import java.util.Arrays;
import java.util.Random;


public class RandomNumberGenerate
{

    public static int[] filter_negative (int[] origin)
    {
        int[] result= new int[origin.length];
        int pos=0;
        for (int val: origin) {
            if(val<0) result[pos++]=val;
        }
        return pos==origin.length ? result : Arrays.copyOf(result, pos);

        /*
        if(pos==origin.length){
            return result;
        }
        else{
            return Arrays.copyOf(result, pos);
        }*/

        throw new IllegalArgumentException("not implemented yet");
    }

    public static int[] filter_odd (int[] origin)
    {


        throw new IllegalArgumentException("not implemented yet");
    }

    public static int[] filter_even (int[] origin)
    {


        throw new IllegalArgumentException("not implemented yet");
    }

    public static void main(String[] args)
    {
    int i, array[];
    int length=20;
    array = new int[length];
    Random number= new Random();

    for(i=0;i<20;i++)
    {
        array[i]=number.nextInt(20)-10;
        //System.out.print(array[i]);
        //System.out.print(" ");
    }
        System.out.println(Arrays.toString(array)); //Arrayi string sheklinde print edir

        System.out.println();
        System.out.print("<");
        for(i=19;i>=0;i--)
        {
            if (i!=0) {
                System.out.printf("%d, ", array[i]);
            }
            else
            {
                System.out.printf("%d", array[i]);
            }
        }
        System.out.print(">");
    int negatives[], positiveOdds[], positiveEvens[];
    int k=0,l=0,m=0;
    negatives= new int[length];
    positiveEvens =new int[length];
    positiveOdds= new int[length];

    for(i=0;i<20;i++)
    {
        if (array[i]<0)
        {
            negatives[k]=array[i];
            k++;
        }
        else
            {
                if(array[i]%2==0)
                {
                    positiveEvens[l]=array[i];
                    l++;
                }
                else
                    {
                        positiveOdds[m]=array[i];
                        m++;
                    }
            }
    }
        System.out.println();
    System.out.println("Negative Array: ");
    for (i=0;i<k;i++)
    {
        System.out.printf("%d ",negatives[i]);
    }
        System.out.println();
    System.out.println("Positive Even Array: ");
        for (i=0;i<l;i++)
        {
            System.out.printf("%d ",positiveEvens[i]);
        }
        System.out.println();
        System.out.println("Positive Odd Array: ");
        for (i=0;i<m;i++)
        {
            System.out.printf("%d ",positiveOdds[i]);
        }

        int[] negatives = filter_negative(array);
        int[] odd = filter_odd(array);
        int[] even = filter_even(array);

    }



}
