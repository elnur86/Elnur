package Day191102;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readFrom {

    public static ArrayList<String> readFromFile() throws IOException {
        ArrayList<String> readArr=new ArrayList<>();
        BufferedReader br = new BufferedReader(
                new FileReader(
                        new File("data/Result.txt")));
        String line;
        // way 1
        while (true) {
            line = br.readLine();
            if (line == null) break;
            readArr.add(line);
        }
        // way 2
    /*
    while ((line = br.readLine()) != null) {
       System.out.println(line);
    }*/

        br.close();
        return readArr;
    }
}
