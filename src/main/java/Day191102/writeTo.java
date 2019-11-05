package Day191102;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class writeTo {

    public static void writeToFile(ArrayList<String> arr, String FileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter(
                        new File(FileName)));
        // -------------
        for( String line: arr) {
            bw.write(line);
            bw.newLine();
        };

       // bw.write(String.valueOf(arr));
        // -------------
        bw.close();
    }
}
