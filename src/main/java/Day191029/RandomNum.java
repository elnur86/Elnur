package Day191029;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.ArrayList;

public class RandomNum {

    public static boolean isOdd(int x)
    {
        return x%2!=0;
    }
    public static boolean isEven(int x)
    {
        return !isOdd(x);
    }

    public static void main(String[] args) {

        Random r = new Random();
        ArrayList<Integer> RandomNumArray=new ArrayList<Integer>()
        {{
        for(int i=0;i<30;i++) {add(r.nextInt(100));}
        }};

        ArrayList<Integer> sorted = new ArrayList<>(RandomNumArray);

       // Bu comparator reqemleri boyukden kichiye dogru siralayir
        /* Comparator<Integer> super_comparator =
                (i1, i2) -> {
                    if (i1 < i2) return 1;      // olduqu kimi saxlamaq uchun return 1 elemek lazimdir.
                    else if (i2 < i1) return -1; //yerini deyishmek lazim olanda -1 return elemek lazimdir.
                    return 0;
                };
        */

       Comparator<Integer> super_comparator =
                (i1, i2) -> {
                    if (isEven(i1)&&isOdd(i2)) return 1;     //reqemlerin cut veya tek olduqunu yoxlayir ve siralayir o shekilde
                    else if(isEven(i1)&&isEven(i2)) return i1-i2;   //cutleri siralayir kichikden boyuge doqru i1-12 olanda kichikden boyuke dogru siralanir
                    else if (isOdd(i1)&&isOdd(i2)) return i2-i1;    //tekleri siralayir boyukden kichiye doqru i2-i1 olanda boyukden kichiye doqru edir
                    return -1;

                };

        Collections.sort(sorted, super_comparator);



        System.out.println(RandomNumArray);
        System.out.println(sorted);


        /*ArrayList<Integer> RandomNumEven=new ArrayList<Integer>()
        {{
            for(int i=0;i<30;i++) {if (RandomNumArray.get(i)%2==0) add(RandomNumArray.get(i));}

        }}*/

    }
}
