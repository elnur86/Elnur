package Day191029;

import java.util.ArrayList;

public class exceptionbyAlexWithObj
{
    public static Holder calcSum(String origin) {
        if (origin == null) return new Holder();
        ArrayList<String> wrong=new ArrayList<>();
        String[] split = origin.split(" ");
        int total =0;
        int count=0;
        for (int i=0; i<split.length; i++) {
            try {
                total+= Integer.parseInt(split[i]);
            } catch (NumberFormatException ignore) {
                count++;
                wrong.add(split[i]);
            }
        }
        return new Holder(total,count,wrong);
    }


    public static void main(String[] args) {

        Holder x = new Holder();
        x=calcSum("1 3 4 dfkj kjsd 3 5 kjjl");
        x.toString();
    }


}
