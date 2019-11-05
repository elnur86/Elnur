package Day191102;

import java.util.ArrayList;
import java.util.Random;
import Day191102.RandomStringAlexWay;

import static Day191102.RandomStringAlexWay.GenRanStr;

public class CreateArrayList {

    public static ArrayList<String> GenArrLst()
    {
       Random r=new Random();

       ArrayList<String> arr1=new ArrayList<String>();
        for(int i=0; i<33;i++)
            arr1.add(GenRanStr(r.nextInt(10)+20));

        return arr1;
    }

}
