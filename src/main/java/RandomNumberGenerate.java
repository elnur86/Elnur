import java.util.Random;


public class RandomNumberGenerate
{
    public static void main(String[] args)
    {
    int i, array[];
    array = new int[20];
    Random number= new Random();

    for(i=0;i<20;i++)
    {
        array[i]=number.nextInt(20)-10;
        System.out.print(array[i]);
        System.out.print(" ");
    }
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

    }



}
