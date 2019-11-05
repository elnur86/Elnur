package Day191102;

import java.io.IOException;
import java.util.ArrayList;

import static Day191102.CreateArrayList.GenArrLst;
import static Day191102.SortArrayList.sortArray;
import static Day191102.readFrom.readFromFile;
import static Day191102.writeTo.writeToFile;


public class task {

    public static void main(String[] args) throws IOException {
        ArrayList<String> arrlist= new ArrayList<>();

        arrlist=GenArrLst();
        writeToFile(arrlist,"data/Result.txt");
        writeToFile(sortArray(readFromFile()),"data/Result1.txt");
    }
}
