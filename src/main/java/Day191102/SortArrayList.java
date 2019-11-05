package Day191102;

import java.util.ArrayList;
import java.util.Comparator;

public class SortArrayList {

public static ArrayList<String> sortArray(ArrayList<String> arr)
    {

        arr.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

    return arr;
    }

}
