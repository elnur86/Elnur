package Day191102;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FindMinimalPair {

        public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Random r = new Random();
        for(int i=0;i<30;i++) {
            arr.add(r.nextInt(100));
        }
        int min_idx=-1;
        int min_sum=Integer.MAX_VALUE;

        for (int idx = 0; idx < arr.size()-1; idx++)
            {
                int sum=arr.get(idx)+arr.get(idx+1);
                if (sum<min_sum)
                {
                    min_idx=idx;
                    min_sum=sum;
                }
            }
            System.out.printf("Array: %s\n",arr);
            System.out.printf("Left Index: %d\n",min_idx);
            System.out.printf("Right Index: %d\n",min_idx+1);
            System.out.printf("The sum: %d\n",min_sum);



    }
}
