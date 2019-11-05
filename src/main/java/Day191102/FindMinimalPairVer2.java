package Day191102;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class FindMinimalPairVer2 {

        public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Random r = new Random();
        for(int i=0;i<30;i++) {
            arr.add(r.nextInt(100));
        }

        Pair pair = IntStream.range(0,arr.size()-1)
                .mapToObj(idx-> new Pair(idx,arr.get(idx)+arr.get(idx+1)))
                .min((p1,p2)->p1.getSum()-p2.getSum())
                .orElseThrow(()->new IllegalArgumentException("The stream must have at least 1 number"));


            System.out.printf("Array: %s\n",arr);
            System.out.printf("Left Index: %d\n",pair.getIdx());
            System.out.printf("Right Index: %d\n",pair.getIdx()+1);
            System.out.printf("The sum: %d\n",pair.getSum());



    }
}
